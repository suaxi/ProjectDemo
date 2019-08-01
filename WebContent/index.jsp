<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
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
				<div>商店内搜索</div> <br />
				<li><form action="doUserscanGame" method="post">
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
		<div class="work">
			<a href="doGameInfo?gameId=1">
				<img src="images/work1.jpg" class="media" alt=""/>
				<div class="caption">
					<div class="work_title">
						<h1>DARK SOULS™ II: Scholar of the First Sin</h1>
					</div>
				</div>
			</a>
		</div>

		<div class="work">
			<a href="doGameInfo?gameId=2">
				<img src="images/work2.jpg" class="media" alt=""/>
				<div class="caption">
					<div class="work_title">
						<h1>Cyberpunk 2077</h1>
					</div>
				</div>
			</a>
		</div>

		<div class="work">
			<a href="doGameInfo?gameId=4">
				<img src="images/work3.jpg" class="media" alt=""/>
				<div class="caption">
					<div class="work_title">
						<h1>DARK SOULS™ III</h1>
					</div>
				</div>
			</a>
		</div>

		<div class="work">
			<a href="doGameInfo?gameId=3">
				<img src="images/work4.jpg" class="media" alt=""/>
				<div class="caption">
					<div class="work_title">
						<h1>The Witcher 3: Wild Hunt</h1>
					</div>
				</div>
			</a>
		</div>

		<div class="work">
			<a href="doGameInfo?gameId=7">
				<img src="images/work5.jpg" class="media" alt=""/>
				<div class="caption">
					<div class="work_title">
						<h1>Sekiro: Shadows Die Twice</h1>
					</div>
				</div>
			</a>
		</div>

		<div class="work">
			<a href="doGameInfo?gameId=6">
				<img src="images/work6.jpg" class="media" alt=""/>
				<div class="caption">
					<div class="work_title">
						<h1>Devil May Cry 5</h1>
					</div>
				</div>
			</a>
		</div>
		
		<div class="work">
			<a href="doGameInfo?gameId=5">
				<img src="images/work7.jpg" class="media" alt=""/>
				<div class="caption">
					<div class="work_title">
						<h1>Total War: THREE KINGDOMS</h1>
					</div>
				</div>
			</a>
		</div>
		
		<div class="work">
			<a href="doGameInfo?gameId=9">
				<img src="images/work8.jpg" class="media" alt=""/>
				<div class="caption">
					<div class="work_title">
						<h1>Tom Clancy's Rainbow Six® Siege</h1>
					</div>
				</div>
			</a>
		</div>
		
		<div class="work">
			<a href="doGameInfo?gameId=10">
				<img src="images/work9.jpg" class="media" alt=""/>
				<div class="caption">
					<div class="work_title">
						<h1>Assassin's Creed® Odyssey</h1>
					</div>
				</div>
			</a>
		</div>
		
		<div class="work">
			<a href="doGameInfo?gameId=8">
				<img src="images/work10.jpg" class="media" alt=""/>
				<div class="caption">
					<div class="work_title">
						<h1>PLAYERUNKNOWN'S BATTLEGROUNDS</h1>
					</div>
				</div>
			</a>
		</div>

	</section><!-- end main -->
	
</body>
</html>