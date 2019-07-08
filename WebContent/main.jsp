<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>耽误你学习的地方</title>
<link type="text/css" rel="stylesheet" href="css/sms.css" />

</head>
<body>
	<div id="main">
		<div class="mainbox">
			<div class="title myMessage png"></div>
			<div class="menu">
			<c:if test="${empty user}">
			<span><a href="index.jsp">请登录</a></span> 		
			</c:if>
			<c:if test="${!empty user}">
				<span>当前用户：<a href="main.jsp">${user.username}</a></span> <span><a
					href="#">发短消息</a></span> <span><a href="doQuit">退出</a></span>
			</c:if>
			</div>
			<div>
			<a href="doQuery">查看所有商品</a>
			</div>
			<div>
			<a href="dogetUserRecode">查看订单信息</a>
			</div>
			<div>
			<a href="addGame.jsp">添加商品</a>
			</div>
			<div>
			<a href="AdminAddBrand.jsp">添加厂商</a>
			</div>
			<div>
			<a href="AdminAddCategory.jsp">添加游戏类型</a>
			</div>
			<div>
			<a href="scanGame.jsp">搜索游戏</a>
			</div>
			<div>
			<a href="doAdminQueryAll">管理员查看游戏信息</a>
			</div>
			<div>
			<a href="doMyCart">我的购物车</a>
			</div>
			<div>
			<a href="doQueryByCategory1">动作</a>
			</div>
			<div>
			<a href="doQueryByCategory2">角色扮演</a>
			</div>
			<div>
			<a href="doQueryByCategory3">策略</a>
			</div>
			<div>
			<a href="doQueryByCategory4">大型多人在线</a>
			</div>
			<div>
			<a href="doMyGame">库</a>
			</div>
			<!--错误信息  -->
			<div id="error"></div>
			<!--短消息列表  -->
			<div class="content messageList"></div>
			
		</div>
	</div>
</body>
</html>
