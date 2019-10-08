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
        <input type="hidden" name="id" id="id" value="${pms.id }" >

        <div class="layui-form-item" >
            <label for="fromOrder" class="layui-form-label" >
                <span class="x-red">*</span>对应订单编号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="fromOrder" name="fromOrder" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${pms.fromOrder }" readonly="readonly">
            </div>
        </div>

        <div class="layui-form-item" >
            <label for="rawMatrialId" class="layui-form-label" >
                <span class="x-red">*</span>物料ID
            </label>
            <div class="layui-input-inline">
                <input type="text" id="rawMatrialId" name="rawMatrialId" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${pms.rawMatrialId }" readonly="readonly">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="productName" class="layui-form-label" readonly="true">
                <span class="x-red">*</span>物料名
            </label>
            <div class="layui-input-inline">
                <input type="text" id="productName" name="productName" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${pms.productName }" readonly="readonly">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="contactId" class="layui-form-label" readonly="true">
                <span class="x-red">*</span>合同ID
            </label>
            <div class="layui-input-inline">
                <input type="text" id="contactId" name="contactId" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${pms.contactId }" readonly="readonly">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="number" class="layui-form-label" readonly="true">
                <span class="x-red">*</span>数量
            </label>
            <div class="layui-input-inline">
                <input type="text" id="number" name="number" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${pms.number }" readonly="readonly">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="status" class="layui-form-label">
                <span class="x-red">*</span>状态
            </label>
            <div class="layui-input-inline">
                <%--<input type="text" id="status" name="status" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${pms.status }" >--%>
                <select name="modules" lay-verify="required" id="status" name="status" lay-search="" >
                    <option value="0">审核采购申请单</option>
                    <option value="1">领导审核采购计划单</option>
                    <option value="2">总经理审批</option>
                    <option value="3">未到货</option>
                    <option value="4">到货未入库</option>
                    <option value="5">已入库</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="inStorageName" class="layui-form-label">
                <span class="x-red">*</span>入库人员
            </label>
            <div class="layui-input-inline">
                <input type="text" id="inStorageName" name="inStorageName" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="storageLocation" class="layui-form-label">
                <span class="x-red">*</span>仓储位置
            </label>
            <div class="layui-input-inline">
                <input type="text" id="storageLocation" name="storageLocation" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="inStorageDate" class="layui-form-label" >
                <span class="x-red">*</span>入库时间
            </label>
            <div class="layui-input-inline">
                <input type="text" id="inStorageDate" name="inStorageDate" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="note" class="layui-form-label">
                <span class="x-red">*</span>备注
            </label>
            <div class="layui-input-inline">
                <input type="text" id="note" name="note" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="">
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
            var id = $('#id').val();
            var fromOrder = $('#fromOrder').val();
            var rawMatrialId = $('#rawMatrialId').val();  //G：连接上面div中的id，提交到下面a.jax中
            var productName = $('#productName').val();
            var contactId = $('#contactId').val();
            var number = $('#number').val();
            var status = $('#status').val();

            var inStorageName= $('#inStorageName').val();
            var storageLocation= $('#storageLocation').val();
            var inStorageDate= $('#inStorageDate').val();
            var note= $('#note').val();


            $.ajax({
                url: "${ctx}/pmsPurchases/update",
                type: "post",
                dataType: "json",
                async: false, // 注意，这里不能用异步，不然后面可能直接到return false了
                data: {
                    id: id,
                    fromOrder:fromOrder,
                    rawMatrialId: rawMatrialId,    //G：这里冒号前面对应的是controller中PmsPurchaseApplicationToCompleteDO里的字段
                    materialId:rawMatrialId, //G：写入库存单
                    productName:productName,
                    contactId: contactId,
                    number:number,
                    //inStorageNum:number,//G：写入库存单
                    status:status,

                    inStorageName:inStorageName,
                    storageLocation:storageLocation,
                    inStorageDate:inStorageDate,
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