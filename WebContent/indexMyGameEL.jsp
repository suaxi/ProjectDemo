<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<title>Epic Shop</title>
	<meta charset="utf-8">
	<meta name="author" content="pixelhint.com">
	<meta name="description" content="Magnetic is a stunning responsive HTML5/CSS3 photography/portfolio website template"/>
	<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0" />
	<link rel="stylesheet" type="text/css" href="css/reset.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
    <script type="text/javascript" src="js/jquery1.js"></script>
    <script type="text/javascript" src="js/main.js"></script>
     <style type="text/css">
	a{text-decoration:none;}
	</style>

</head>
<body>
	<header>
		<div class="logo">
			<a href="#"><img src="images/logo.jpg" title="Magnetic" alt="Magnetic"/></a>
		</div><!-- end logo -->

		<div id="menu_icon"></div>
		<nav>
			<div class="menu">
			<c:if test="${empty user}">
			<span><a href="SignIn.jsp">请登录</a></span> 		
			</c:if>
			<c:if test="${!empty user}">
				<span>当前用户：<a href="index.jsp">${user.username}</a></span> <span><a href="doQuit">退出</a></span>
			</c:if>
			</div>
			<ul>
				<div >商店内搜索</div> <br>
				<li><form action="doscanGame" method="post">
                  <input type="text" name="gameName" id="search_field" />
                  <input type="submit" value="搜索" id="search_button" />
				</form></li>
				<li><a href="doQueryAll">全部游戏</a></li>
				<li><a href="doMyGame">库</a></li>
				<li><a href="doQueryByCategory1">动作</a></li>
				<li><a href="doQueryByCategory2">角色扮演</a></li>
				<li><a href="doQueryByCategory3">策略</a></li>
				<li><a href="doQueryByCategory4">大型多人在线</a></li>
				<li><a href="dogetUserRecode">订单信息</a></li>
				<li><a href="doMyCart">购物车</a></li>
			</ul>
		</nav><!-- end navigation menu -->

		<div class="footer clearfix">
			
			<div class="rights">
				<p>Design © 2019 Epic Game</p>
			</div><!-- end rights -->
		</div ><!-- end footer -->
	</header><!-- end header -->
	<section class="main clearfix">
	<div align="center">
<!-- <div class="center-in-center"> -->
<table border="1px" cellspacing="0" >
<caption><h1>我的游戏</h1></caption>
				<tr>
					<th><h3>游戏名&nbsp;&nbsp;</h3></th>
					<th><h3>&nbsp;&nbsp;购买日期</h3></th>
				</tr>
<c:forEach var="game" items="${list}">
				<tr>				
					<th><h3>${game.name}&nbsp;&nbsp;</h3></th>
					<th><h3>&nbsp;&nbsp;${game.buy_date}</h3></th>
					<th>
					<a href="doDownload"><h3>&nbsp;&nbsp;&nbsp;&nbsp;安装客户端</h3></a>
					</th>
				</tr>				
</c:forEach>
</table>
	</div>
	
	</section><!-- end main -->
	<div align="right"><a href="index.jsp"><h3>返回首页</h3></a></div>
</body>
</html>