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
    <title>wms仓库管理系统--库内盘点</title>
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
        <a href="">库内盘点例子</a>
        <a href="${ctx }/inventorys/page/list">
          <cite>库存查看例子</cite></a>
      </span>

    </div>
    <div class="x-body">

      <div class="demoTable">
        类型：
        <div class="layui-inline">
          <input class="layui-input" name="type" id="type" autocomplete="off">
        </div>

        名称：
        <div class="layui-inline">
          <input class="layui-input" name="name" id="name" autocomplete="off">
        </div>
        <button id="do_search" class="layui-btn" data-type="reload">搜索</button>

        <button id="do_add" class="layui-btn layui-btn-normal" data-type="reload">添加</button>


      </div>

        <div class="layui-inline">
            <button id="do_reload" class="layui-btn layui-btn-normal" data-type="reload" onclick="window.location.reload()">刷新</button>
        </div>

      <%--<table id="list-permission" class="layui-hide"  lay-filter="permissionTableFilter"></table>--%>
        <table class="layui-table" lay-even="true"     <%--G：lay-even属性表示开启隔行背景；lay-skin属性表示行边框风格--%>

               lay-filter="permissionTableFilter"
               lay-data="{
                            url: '${ctx}/inventorys/list' //数据接口 ,直接去controller
                            ,id: 'inventoryTableId'
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
                            ,toolbar: 'default' //开启工具栏，此处显示默认图标，可以自定义模板，详见文档
                            ,defaultToolbar: ['print', 'exports'] // ['filter', 'print', 'exports']
                            ,parseData: function(res){ //res 即为原始返回的数据
                                return {
                                    'code': res.code, //解析接口状态
                                'msg': res.message, //解析提示文本
                                'count': res.data.total, //解析数据长度
                                'data': res.data.list //解析数据列表
                                };
                            }
                         }"
        >
            <thead>
            <tr>
                <th lay-data="{type: 'checkbox', fixed: 'left'}"></th>
                <th lay-data="{field: 'id', width:100, sort: true, fixed: 'left'}">ID</th>
                <th lay-data="{field: 'type', width:100}">类型</th>
                <th lay-data="{field: 'name', width:100}">名称</th>
                <th lay-data="{field: 'amount', width:100}">数量</th>
                <th lay-data="{field: 'warehouseId', width:100}">仓库ID</th>
                <th lay-data="{field: 'putInTime', width:200}">入库时间</th>
                <%--G：这里的名字都是用的model字段，不是数据库里的字段--%>

                <th lay-data="{fixed: 'right', width: 150, align:'center', toolbar: '#barDemo'}">操作</th>
            </tr>
            </thead>
        </table>



        <script type="text/html" id="barDemo">
            <%--<a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">详情</a>--%>
            <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
            <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
        </script>
        <script>
            function table_tr_color() {

            }
            layui.use('table', function(){
                var table = layui.table;

                //监听 头工具栏事件
                table.on('toolbar(permissionTableFilter)', function(obj) {
                  var checkStatus = table.checkStatus(obj.config.id)
                          ,data = checkStatus.data; //获取选中的数据
                  switch (obj.event) {
                    case 'add':
                        x_admin_show('编辑','${ctx}/inventorys/page/add');
                        break;
                    case 'update':
                        if (data.length === 0) {
                            layer.msg('请选择一行');
                        } else if (data.length > 1) {
                            layer.msg('只能同时编辑一个');
                        } else {
                            x_admin_show('编辑','${ctx}/inventorys/page/update?id='+checkStatus.data[0].id);
                        }
                        break;
                    case 'delete':
                      if (data.length === 0) {
                          layer.msg('请选择一行');
                      } else {
                          var delError = "";
                          // for循环删除所有选中行
                          for (var i = 0; i < checkStatus.data.length; i++) {
                            $.ajax({
                              url: "${ctx}/inventorys/delete",
                              type: "post",
                              dataType: "json",
                              async: false, // 注意，这里不能用异步，不然后面可能直接到return false了
                              data: {
                                id: checkStatus.data[i].id
                              },
                              success: function (result) {
                                if (result.success) {

                                } else {
                                  delError = delError + checkStatus.data[i].key + ",";
                                }
                              },
                              error: function (result) {
                                alert.log("error-error-error-error-error");
                              }
                            });
                          }
                          if (delError.length === 0) {
                              layer.alert("删除成功");
                              location.reload();
                          }
                          else {
                              layer.alert("这些权限删除失败: " + delError);
                          }
                      }
                      break;
                  };
                });

                //监听 行工具事件
                table.on('tool(permissionTableFilter)', function(obj){ //注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
                    var data = obj.data //获得当前行数据
                            ,layEvent = obj.event; //获得 lay-event 对应的值
                   /*if(layEvent === 'detail'){
                      layer.msg('查看操作');
                    } else*/

                    if(layEvent === 'del'){// 删除行
                      layer.confirm('真的删除行么', function(index){
                          //alert(JSON.stringify(data));
                          $.ajax({
                            url: "${ctx}/inventorys/delete",
                            type: "post",
                            dataType: "json",
                            async: false, // 注意，这里不能用异步，不然后面可能直接到return false了
                            data: {
                              id: data.id
                            },
                            success: function (result) {
                              if (result.success) {
                                  layer.close(index);
                                  // 刷新页面
                                  location.reload();
                              } else {
                                  layer.alert("删除失败！" + result.code+": "+result.message);
                                  /*layer.close(index);
                                  // 刷新页面
                                  location.reload();*/
                              }
                            },
                            error: function (result) {
                              alert.log("error-error-error-error-error");
                            }
                          });

                      });
                    } else if(layEvent === 'edit'){ // 编辑行
                      x_admin_show('编辑','${ctx}/inventorys/page/update?id='+data.id);
                      //layer.msg(data.id);
                    }
                });

                  // 执行搜索，表格重载
                  $('#do_search').on('click', function () {
                    // 搜索条件
                    var type = $('#type').val();
                    var name = $('#name').val();

                    table.reload('inventoryTableId', {
                      method: 'get'
                      , where: {
                        'type': type,
                        'name': name
                      }
                      , page: {
                        curr: 1
                      }
                    });
                  });

                // 执行添加
                $('#do_add').on('click', function () {
                  x_admin_show('编辑','${ctx}/inventorys/page/add');
                });


            });



        </script>

    </div>
      

  </body>

</html>