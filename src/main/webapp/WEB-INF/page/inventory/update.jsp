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
        <input type="hidden" name="id" id="id" value="${inventory.id }" >
        <div class="layui-form-item">
            <label for="type" class="layui-form-label">
                <span class="x-red">*</span>类型
            </label>
            <div class="layui-input-inline">
                <input type="text" id="type" name="type" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${inventory.type }">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="name" class="layui-form-label">
                <span class="x-red">*</span>名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="name" name="name" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${inventory.name }">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="amount" class="layui-form-label">
                <span class="x-red">*</span>数量
            </label>
            <div class="layui-input-inline">
                <input type="text" id="amount" name="amount" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${inventory.amount }">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="warehouseId" class="layui-form-label">
                <span class="x-red">*</span>仓库ID
            </label>
            <div class="layui-input-inline">
                <input type="text" id="warehouseId" name="warehouseId" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${inventory.warehouseId }">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="putInTime" class="layui-form-label">
                <span class="x-red">*</span>入库时间
            </label>
            <div class="layui-input-inline">
                <input type="date" id="putInTime" name="putInTime" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${inventory.putInTime }">
            </div>
        </div>
                                    <%--G：lay-verify="required"属性表示必填选项--%>
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
            var type = $('#type').val();
            var name = $('#name').val();
            var amount = $('#amount').val();
            var warehouseId = $('#warehouseId').val();
            var putInTime = $('#putInTime').val();

            $.ajax({
                url: "${ctx}/inventorys/update",
                type: "post",
                dataType: "json",
                async: false, // 注意，这里不能用异步，不然后面可能直接到return false了
                data: {
                    id: id,
                    type: type,
                    name: name,
                    amount:amount,
                    warehouseId:warehouseId,
                    putInTime:putInTime
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