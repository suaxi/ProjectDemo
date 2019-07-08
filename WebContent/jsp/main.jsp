<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>海文 在线短信平台</title>
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
					href="#">发短消息</a></span> <span><a href="#">退出</a></span>
			</c:if>
			</div>
			<div>
			<a href="doQuery">查看所有商品</a>
			</div>
			<!--错误信息  -->
			<div id="error"></div>
			<!--短消息列表  -->
			<div class="content messageList"></div>
			
		</div>
	</div>
</body>
</html>
