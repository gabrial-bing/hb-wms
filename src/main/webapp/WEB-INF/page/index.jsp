<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>wms仓库系统服务后台登录</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />

    <link rel="shortcut icon" href="${ctx}/public/logo.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${ctx}/public/css/font.css">
	<link rel="stylesheet" href="${ctx}/public/css/xadmin.css">
    <%--<script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>--%>
    <script type="text/javascript" src="${ctx}/public/js/jquery/jquery.min.js"></script>
    <script src="${ctx}/public/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${ctx}/public/js/xadmin.js"></script>

</head>
<body>
    <!-- 顶部开始 -->
    <div class="container">
        <div class="logo"><a href="#">wms仓库管理系统</a></div>
        <div class="left_open">
            <i title="展开左侧栏" class="iconfont">&#xe699;</i>
        </div>
        
        <ul class="layui-nav right" lay-filter="">
          <li class="layui-nav-item">
            <a href="javascript:;">${sessionScope.user_session.username }</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
              <dd><a onclick="x_admin_show('个人信息','${ctx }/users/myupdate')">个人信息</a></dd>
              <dd><a href="${ctx}/logout">退出</a></dd>
            </dl>
          </li>
          <li class="layui-nav-item to-index"><a>欢迎登录</a></li>
        </ul>
        
    </div>
    <!-- 顶部结束 -->
    <!-- 中部开始 -->
     <!-- 左侧菜单开始 -->
    <div class="left-nav">
      <div id="side-nav">
          <ul id="nav">
              <li>
                  <a id="menu-inventorys-info" href="javascript:;">
                      <i class="iconfont">&#xe723;</i>
                      <cite>库内盘点</cite>
                      <i class="iconfont nav_right">&#xe697;</i>
                  </a>
                  <ul class="sub-menu">
                      <%--<li>
                          <a id="page-inventorys-info" _href="${ctx }/inventorys/page/list">
                              <i class="iconfont">&#xe6a7;</i>
                              <cite>库存查看</cite>
                          </a>
                      </li >--%>

                      <li>
                          <a id="page-allot-check" _href="/HB_cloud/admin/allocation.html"><%--http://47.105.155.225--%>
                              <i class="iconfont">&#xe6a7;</i>
                              <cite>调拨审核</cite>
                          </a>
                      </li >

                      <li>
                          <a id="asdsads" _href="${ctx }/storesLists/page/list">
                              <i class="iconfont">&#xe6a7;</i>
                              <cite>原料库存查看</cite>
                          </a>
                      </li >

                      <li>
                          <a id="page-finished-product-storelist" _href="${ctx }/commodityStoresLists/page/list">
                              <i class="iconfont">&#xe6a7;</i>
                              <cite>成品库存查看</cite>
                          </a>
                      </li >

                  </ul>
              </li>

              <li>
                  <a id="menu-in-inventorys-admin" href="javascript:;">
                      <i class="iconfont">&#xe723;</i>
                      <cite>入库管理</cite>
                      <i class="iconfont nav_right">&#xe697;</i>
                  </a>
                  <ul class="sub-menu">
                      <li>
                          <%--①点击左侧列表--%>
                          <a id="page-pmsPurchases-info" _href="${ctx }/pmsPurchases/page/list">
                              <%-- G：这里路径不是文件路径，而是controller里面的  @RequestMapping("/inventorys")--%>
                              <i class="iconfont">&#xe6a7;</i>
                              <cite>采购单查看</cite>
                          </a>
                      </li >
                  </ul>
                  <ul class="sub-menu">
                      <li>
                          <a id="page-in-inventorys-admin" _href="${ctx }/stockIns/page/list">
                              <i class="iconfont">&#xe6a7;</i>
                              <cite>入库单管理</cite>
                          </a>
                      </li >

                      <li>
                          <a id="page-sell-return-in-store" _href="/HB_cloud/admin/crmOrder.html">
                              <i class="iconfont">&#xe6a7;</i>
                              <cite>销售退货入库</cite>
                          </a>
                      </li >
                      <li>
                          <a id="page-waste-process-in-store" _href="/HB_cloud/admin/defectiveProductsList.html">
                              <i class="iconfont">&#xe6a7;</i>
                              <cite>废料加工入库</cite>
                          </a>
                      </li >
                      <li>
                          <a id="page-finished-product-in-store" _href="http://47.105.155.225/HB_cloud/admin/commodity.html">
                              <i class="iconfont">&#xe6a7;</i>
                              <cite>成品入库</cite>
                          </a>
                      </li >
                  </ul>
              </li>

              <li>
                  <a id="menu-out-inventory-admin" href="javascript:;">
                      <i class="iconfont">&#xe723;</i>
                      <cite>出库管理</cite>
                      <i class="iconfont nav_right">&#xe697;</i>
                  </a>
                  <ul class="sub-menu">
                      <li>
                          <a id="page-out-inventory-req" _href="${ctx }/materialDeliveryOrders/page/list">
                              <i class="iconfont">&#xe6a7;</i>
                              <cite>原料出库申请</cite>
                          </a>
                      </li >
                  </ul>
                  <ul class="sub-menu">
                      <li>
                          <a id="page-out-inventory-record" _href="${ctx }/stockOuts/page/list">
                              <i class="iconfont">&#xe6a7;</i>
                              <cite>原料出库记录</cite>
                          </a>
                      </li >
                  </ul>

                  <ul class="sub-menu">
                      <li>
                          <a id="page-product-out-req" _href="${ctx }/inventorys/page/list">
                              <i class="iconfont">&#xe6a7;</i>
                              <cite>成品出库申请</cite>
                          </a>
                      </li >
                  </ul>
                  <ul class="sub-menu">
                      <li>
                          <a id="page-product-out-record" _href="${ctx }/commodityStockOuts/page/list">
                              <i class="iconfont">&#xe6a7;</i>
                              <cite>成品出库记录</cite>
                          </a>
                      </li >
                  </ul>
              </li>

          </ul>
      </div>
    </div>
    <!-- <div class="x-slide_left"></div> -->
    <!-- 左侧菜单结束 -->
    <!-- 右侧主体开始 -->
    <div class="page-content">
        <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
          <ul class="layui-tab-title">
            <li class="home"><i class="layui-icon">&#xe68e;</i>我的桌面</li>
          </ul>
          <div class="layui-tab-content">
            <div class="layui-tab-item layui-show">
                <iframe src='${ctx}/welcome' frameborder="0" scrolling="yes" class="x-iframe"></iframe>
            </div>
          </div>
        </div>
    </div>
    <div class="page-content-bg"></div>
    <!-- 右侧主体结束 -->
    <!-- 中部结束 -->
    <!-- 底部开始 -->
    <div class="footer">
        <div class="copyright">Copyright ©2019 </div>  
    </div>
    <!-- 底部结束 -->

    <%--权限埋点--%>
    <script>
        $(function() {
            // 存登入用户拥有的所有权限id
            let permissionIdSet;
            // 存该业务系统里所有资源resource
            let resourceArray;
            //alert("登入用户的Id: " + ${sessionScope.user_session.id} +"\n"+ "登入系统的systemId: " + ${sessionScope.systemId});

            $.ajax({
                url: "/hb-upms/permissions/listPermissionIdOfUser",
                type: "get",
                dataType: "json",
                async: false,
                data: {
                    userId: ${sessionScope.user_session.id}
                },
                success: function (result) {
                    if (result.success) {
                        permissionIdSet = new Set(result.data);
                    } else {
                        alert("获取用户的权限列表失败！" + result.code+": "+result.message);
                    }
                },
                error: function (result) {
                    alert("listPermissionIdOfUser-error");
                }
            });

            let printPermissionIdSet = [];
            for (let item of permissionIdSet) {
                printPermissionIdSet.push(item);
            }
            //alert("登入用户拥有的所有permissionId: " + JSON.stringify(printPermissionIdSet));

            $.ajax({
                url: "/hb-upms/resources/listOfResourceIdAndPermissionId",
                type: "get",
                dataType: "json",
                async: false,
                data: {
                    systemId: 4
                },
                success: function (result) {
                    if (result.success) {
                        resourceArray = result.data;
                    } else {
                        alert("删除失败！" + result.code+": "+result.message);
                    }
                },
                error: function (result) {
                    alert("listOfResourceIdAndPermissionId-error");
                }
            });
            //alert("该系统中所有需要权限控制的资源: " + JSON.stringify(resourceArray));

            // 存业务系统中resource的key和permissionId键值对
            let resourceKeyAndPermissionIdMap = new Map();
            let printresourceKeyAndPermissionIdMap = [];
            for (let i = 0; i < resourceArray.length; i++) {
                resourceKeyAndPermissionIdMap.set(resourceArray[i].key, resourceArray[i].permissionId);
                printresourceKeyAndPermissionIdMap.push(resourceArray[i].key + ": " + resourceArray[i].permissionId);
            }
            //alert("业务系统中resource的key和permissionId键值对: " + JSON.stringify(printresourceKeyAndPermissionIdMap));


            // let array = [];
            // 获取<body></body>中所有html标签
            let divs = $("body *");
            for (let i = 0; i < divs.length; i++) {
                // 过滤出有id属性的html标签
                if (divs[i].id !== undefined && divs[i].id !== "") {
                    //array.push(divs[i].id);
                    // 如果是需要权限控制的资源，且permissionIdSet中没有该资源关联的permissionId
                    if (resourceKeyAndPermissionIdMap.has(divs[i].id)) {
                        //alert("资源: " + divs[i].id + " 是需要权限控制的资源, 关联的权限id是: " + resourceKeyAndPermissionIdMap.get(divs[i].id));
                        //alert("该用户是否有使用该资源的权限？ "+ permissionIdSet.has(resourceKeyAndPermissionIdMap.get(divs[i].id)));
                        if ( !permissionIdSet.has(resourceKeyAndPermissionIdMap.get(divs[i].id)) ) {
                            $("#"+divs[i].id).remove();
                        }
                    }
                }
            }
        });

    </script>

</body>
</html>