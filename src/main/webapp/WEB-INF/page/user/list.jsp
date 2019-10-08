<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<!-- 设置一个项目路径的变量  -->
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
  
  <head>
    <meta charset="UTF-8">
    <title>upms通用权限管理系统--用户管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="${ctx}/public/logo.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${ctx}/public/css/font.css">
    <link rel="stylesheet" href="${ctx}/public/css/xadmin.css">

      <link rel="stylesheet" href="${ctx}/public/layui/css/layui.css" media="all">

    <link href="${ctx}/public/css/pager.css" type="text/css" rel="stylesheet" />
    <%--<script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>--%>
    <script type="text/javascript" src="${ctx}/public/js/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="${ctx}/public/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${ctx}/public/js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  
  <body>
    <div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">用户管理</a>
        <a href="${ctx }/users/page/list">
          <cite>用户查看</cite></a>
      </span>

    </div>
    <div class="x-body">

      <div class="demoTable">
        用户名称：
        <div class="layui-inline">
          <input class="layui-input" name="username" id="username" autocomplete="off">
        </div>
        <button id="do_search" class="layui-btn" data-type="reload">搜索</button>

        <button id="do_roleAuth" style="position:relative;left: 50px;" class="layui-btn layui-btn-normal" data-type="reload">授予角色</button>
      </div>



      <table id="list-user" class="layui-hide"  lay-filter="userTableFilter"></table>

        <script>
            layui.use('table', function(){
                var table = layui.table;

                //第一个实例
                table.render({
                    elem: '#list-user'
                    ,url: '${ctx}/users/list' //数据接口
                    ,id: 'userTableId'
                    ,height: 500
                    ,limits : [2,10,15,20,25]
                    ,limit : 10
                    ,request: {
                        pageName: 'pageNum' //页码的参数名称，默认：page
                        ,limitName: 'pageSize' //每页数据量的参数名，默认：limit
                    }
                    ,response: {
                        statusName: 'code' //规定数据状态的字段名称，默认：code
                        ,statusCode: 200 //规定成功的状态码，默认：0
                        //,msgName: 'msg' //规定状态信息的字段名称，默认：msg
                        //,countName: 'count' //规定数据总数的字段名称，默认：count
                        //,dataName: 'data' //规定数据列表的字段名称，默认：data
                    }
                    ,page: true //开启分页
                    ,cols: [[ //表头
                        {type: 'checkbox', fixed: 'left'},
                        {field: 'id', title: 'ID', width:100, sort: true, fixed: 'left'}
                        ,{field: 'username', title: '用户名称', width:200}
                    ]]
                    ,parseData: function(res){ //res 即为原始返回的数据
                        //alert(JSON.stringify(res));
                        return {
                            "code": res.code, //解析接口状态
                            "msg": res.message, //解析提示文本
                            "count": res.data.total, //解析数据长度
                            "data": res.data.list //解析数据列表
                        };
                    }
                });


                  // 执行搜索，表格重载
                  $('#do_search').on('click', function () {
                    // 搜索条件
                    var username = $('#username').val();

                    table.reload('userTableId', {
                      method: 'get'
                      , where: {
                        'username': username
                      }
                      , page: {
                        curr: 1
                      }
                    });
                  });

                // 给用户授予角色
                $('#do_roleAuth').on('click', function () {
                  // 获取id为userTableId的数据表格中选中行的数据
                  var checkData = table.checkStatus('userTableId').data;
                  if (checkData.length === 0) {
                    layer.msg('请选择需要被授予角色的用户');
                  } else if (checkData.length > 1) {
                    layer.msg('只能同时为一个用户授予角色');
                  } else {
                    x_admin_show('授予角色','${ctx}/users/page/roleAuth?id='+checkData[0].id);
                  }
                });


            });



        </script>

    </div>
      

  </body>

</html>