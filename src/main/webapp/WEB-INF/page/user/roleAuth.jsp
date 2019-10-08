<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 设置一个项目路径的变量  -->
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>upms通用权限管理系统--授予角色</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${ctx}/public/css/font.css">
    <link rel="stylesheet" href="${ctx}/public/css/xadmin.css">
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

<div class="x-body">
    <input type="hidden" name="id" id="id" value="${role.id }">

    <div class="layui-btn-container">
        <button id="do_roleAuth" type="button"
                style="position:relative;left: 365px;margin-right:5%; margin-top:3px; line-height:1.6em;" class="layui-btn layui-btn-normal layui-btn-small">
            <i class="layui-icon"></i>授予角色
        </button>
    </div>

    <div id="roleTransfer" class="demo-transfer"></div>

</div>
<script>

    var roleArray; // 从后台获取的角色信息列表
    var userHasRoleIdArray; // 从后台获取的该用户拥有的角色列表
    var userId; // 进入该用户授予角色页面的 用户id

    // 页面加载完后就执行
    $(function(){
        // 加载页面中的初始化数据
        initData();
    });

    function initData() {
        // 获取该业务系统的所有角色信息
        getRoleArray();
        //alert(JSON.stringify(roleArray));

        // 从用户查询页面中的用户列表选择的要被授予角色的用户id
        userId = ${user}.id;
        //alert("用户id: " + userId);
        // 获取该用户拥有的角色id
        getUserHasRoleIdArray(userId);
        //alert("用户拥有的角色id列表" + userHasRoleIdArray);
    }

    // 获取该业务系统的所有角色信息
    function getRoleArray() {
        $.ajax({
            url: "${ctx}/roles/listAll",
            type: "get",
            dataType: "json",
            async: false, // 注意，这里不能用异步，不然后面可能直接到return false了
            data: {

            },
            success: function (result) {
                roleArray = result.data;
            },
            error: function (result) {
                alert("getRoleList_error");
            }
        });
    }

    // 获取该用户拥有的角色id数组
    function getUserHasRoleIdArray(userId) {
        $.ajax({
            url: "${ctx}/roles/role_id_list",
            type: "get",
            dataType: "json",
            async: false, // 注意，这里不能用异步，不然后面可能直接到return false了
            data: {
                userId: userId
            },
            success: function (result) {
                userHasRoleIdArray = result.data;
            },
            error: function (result) {
                alert("getUserRoleIdList_error");
            }
        });
    }


    layui.use(['form','layer', 'util', 'transfer'], function(){
        $ = layui.jquery;
        var form = layui.form
            ,layer = layui.layer
            ,transfer = layui.transfer
            ,util = layui.util
        ;


        transfer.render({
            elem: '#roleTransfer'
            ,title: ['角色列表', '该用户已有的角色']  //自定义标题
            ,data: roleArray //数据源
            ,id: 'transeferId' //定义唯一索引
            ,parseData: function(res){ // 数据源格式解析
                return {
                    "value": res.id //数据值
                    ,"title": res.name //数据标题
                    ,"disabled": res.disabled  //是否禁用
                    ,"checked": res.checked //是否选中
                }
            }
            //,width: 150 //定义宽度
            ,height: 500 //定义高度
            ,value: userHasRoleIdArray // 初始右侧数据为用户拥有的角色id数组
            ,showSearch: true  //显示搜索框
            /*,onchange: function(obj, index){ //穿梭时的回调
                var arr = ['左边', '右边'];
                layer.alert('来自 <strong>'+ arr[index] + '</strong> 的数据：'+ JSON.stringify(obj)); //获得被穿梭时的数据
            }*/
        });


        // 给用户授予角色
        $('#do_roleAuth').on('click', function () {
            //获取transfer组件右侧数据
            var getData = transfer.getData('transeferId');
            var selectRoleIdArray = [];
            for (var i = 0; i < getData.length; i++) {
                selectRoleIdArray.push(getData[i].value);
            }

            //alert("用户id: " + userId);
            // 获取右侧角色id数组
            //alert("右侧中的角色列表: " + JSON.stringify(selectRoleIdArray));

            /**
             * 注意：特殊情况，剥夺该User与角色的关系
             *  由于ajax不能传空数组（[]）到后端，所以加了一个-2代表没有选中资源上任何节点，后端对
             *  该情况做特殊情况判断
             */
            if (selectRoleIdArray.length === 0) {
                selectRoleIdArray.push(-2);
            }
            $.ajax({
                url: "${ctx}/roles/role_auth",
                type: "post",
                dataType: "json",
                async: false,
                data: {
                    userId: userId,
                    roleList: selectRoleIdArray
                },
                success: function (result) {
                    if (result.success) {
                        layer.alert("授予角色成功", {icon: 6},function () {
                            // 获得frame索引
                            var index = parent.layer.getFrameIndex(window.name);
                            //关闭当前frame
                            parent.layer.close(index);
                            // 刷新页面
                            parent.location.reload();
                        });
                    } else {
                        layer.alert("授予角色成功！" + result.code+": "+result.message);
                    }
                },
                error: function (result) {
                    alert("roleAuth_error");
                }
            });
        });


    });

</script>

</body>

</html>