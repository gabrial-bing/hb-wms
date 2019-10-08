<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 设置一个项目路径的变量  -->
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>wms仓库管理系统--修改信息</title>
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
    <form class="layui-form" method="POST" id="permissionForm">
        <input type="hidden" name="commodityInventoryId" id="commodityInventoryId" value="${csl.commodityInventoryId }" >

        <div class="layui-form-item" >
            <label for="orderId" class="layui-form-label" >
                <span class="x-red">*</span>订单号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="orderId" name="orderId" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${csl.orderId }">
            </div>
        </div>

        <div class="layui-form-item" >
            <label for="clientName" class="layui-form-label" >
                <span class="x-red">*</span>客户名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="clientName" name="clientName" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${csl.clientName }">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="commodityId" class="layui-form-label" readonly="true">
                <span class="x-red">*</span>商品编号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="commodityId" name="commodityId" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${csl.commodityId }">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="inlandOrOut" class="layui-form-label" readonly="true">
                <span class="x-red">*</span>国内(外)
            </label>
            <div class="layui-input-inline">
                <input type="text" id="inlandOrOut" name="inlandOrOut" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${csl.inlandOrOut }">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="inventoryNum" class="layui-form-label" readonly="true">
                <span class="x-red">*</span>库存数量
            </label>
            <div class="layui-input-inline">
                <input type="text" id="inventoryNum" name="inventoryNum" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${csl.inventoryNum }">
            </div>
        </div>

        <div class="layui-form-item">
            <label for="storageLocation" class="layui-form-label">
                <span class="x-red">*</span>仓储位置
            </label>
            <div class="layui-input-inline">
                <input type="text" id="storageLocation" name="storageLocation" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${csl.storageLocation }">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="note" class="layui-form-label">
                <span class="x-red">*</span>备注
            </label>
            <div class="layui-input-inline">
                <input type="text" id="note" name="note" required=""
                       autocomplete="off" class="layui-input" value="${csl.note }">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">
            </label>
            <input type="submit" value=" 提交" class="layui-btn" lay-filter="submitFilter" lay-submit=""/>
        </div>
    </form>
</div>
<script>
    layui.use(['form','layer'], function(){
        $ = layui.jquery;
        var form = layui.form
            ,layer = layui.layer;

        // TODO:自定义验证规则
        /*form.verify({
            key: function(value){
                if(value.length < 5){
                    return '昵称至少得5个字符啊';
                }
            }
            ,pass: [/(.+){6,12}$/, '密码必须6到12位']
            ,repass: function(value){
                if($('#L_pass').val()!=$('#L_repass').val()){
                    return '两次密码不一致';
                }
            }
        });*/


        // 监听提交
        form.on('submit(submitFilter)', function(data){
            var commodityInventoryId = $('#commodityInventoryId').val();
            var orderId = $('#orderId').val();
            var clientName = $('#clientName').val();
            var commodityId = $('#commodityId').val();
            var inlandOrOut = $('#inlandOrOut').val();
            var inventoryNum = $('#inventoryNum').val();
            var storageLocation= $('#storageLocation').val();
            var note= $('#note').val();


            $.ajax({
                url: "${ctx}/commodityStoresLists/update",
                type: "post",
                dataType: "json",
                async: false, // 注意，这里不能用异步，不然后面可能直接到return false了
                data: {
                    commodityInventoryId: commodityInventoryId,
                    orderId:orderId,
                    clientName:clientName,
                    commodityId: commodityId,
                    inlandOrOut:inlandOrOut,
                    inventoryNum:inventoryNum,
                    storageLocation:storageLocation,
                    note:note
                },
                success: function (result) {
                    if (result.success) {
                        layer.alert("修改成功", {icon: 6},function () {
                            // 获得frame索引
                            var index = parent.layer.getFrameIndex(window.name);
                            //关闭当前frame
                            parent.layer.close(index);
                            // 刷新页面
                            parent.location.reload();
                        });

                    } else {
                        layer.alert("修改失败！" + result.code+": "+result.message);
                    }
                },
                error: function (result) {
                    alert.log("error-error-error-error-error");
                }
            });
            return false; // 注意
        });


    });

</script>

</body>

</html>