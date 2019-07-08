<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Epic</title>
<meta name="keywords" content="Game Website Template, free templates, website templates, CSS, XHTML" />
<meta name="description" content="Game Website Template - download free XHTML/CSS files from cssMoban.com" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="templatemo_wrapper_outer">
<div id="templatemo_wrapper_inner">
	
    <div id="templatemo_banner"></div> <!-- end of banner -->
    <div class="menu">
			<c:if test="${empty user}">
			<span><a href="index.jsp">请登录</a></span> 		
			</c:if>
			<c:if test="${!empty user}">
				<span>当前用户：<a href="index.jsp">${user.username}</a></span> <span><a href="doQuit">退出</a></span>
			</c:if>
			</div>
<div id="templatemo_menu">
	    <ul>
            <li><a href="doQuery" class="current">商店</a></li>
            <li><a href="#">库</a></li>
            <li><a href="#">社区</a></li>
            <li><a href="dogetUserRecode">订单信息</a></li>
            <li><a href="doMyCart">购物车</a></li>
        </ul>
</div><!-- end of menu -->
    
    <div id="templatemo_content_wrapper">
    
    	<div class="templatemo_side_bar margin_right_10">
        	
            <div class="header_01">游戏类型</div>
            	<ul>
                    <li><a href="doQueryByCategory1">动作</a></li>
                    <li><a href="doQueryByCategory2">角色扮演</a></li>
                    <li><a href="doQueryByCategory3">策略</a></li>
                    <li><a href="doQueryByCategory4">大型多人在线</a></li>
                </ul>
			
            <div class="margin_bottom_20 horizontal_divider"></div> 
			<div class="margin_bottom_20"></div>

            <div class="header_01">商店内搜索</div>     
            <form action="doscanGame" method="post">
                  <input type="text" name="gameName" id="search_field" />
                  <input type="submit" value="" id="search_button" />
            </form>
            <div class="margin_bottom_20"></div>
        </div> <!-- end of left side bar -->
        
        <div class="templatemo_content margin_right_10">
        
        	<div class="content_section">
           	  <div class="header_02">Game</div>
			  <table border="1px" cellspacing="0" >
				<tr>
					<th>游戏名</th>
					<th>发行商</th>
					<th>游戏类型</th>
					<th>价格</th>
					<th>发行日期</th>
					<th>游戏简介</th>
				</tr>
				<c:forEach var="game" items="${list}">
				<tr>			
					<th>${game.name1}</th>
					<th>${game.name2}</th>
					<th>${game.name3}</th>
					<th>${game.price}</th>
					<th>${game.start_date}</th>
					<th>${game.infor}</th>
				<th><a href="doBuy?gameId=${game.id}&price=${game.price}">购买</a></th>
				<th><a href="doAddCart?gameId=${game.id}&price=${game.price}">添加购物车</a></th>
				</tr>				
</c:forEach>
</table>
            </div>
            
            <div class="margin_bottom_20 horizontal_divider"></div> 
			<div class="margin_bottom_20"></div>
        </div> <!-- end of content -->
    	
        <div class="cleaner"></div>    
    </div> <!-- end of content wrapper -->
    
</div>
</div>

 <div id="templatemo_footer">
        Copyright © 2019 <a href="#">Epic</a>
   	</div> <!-- end of footer -->
    <div class="margin_bottom_10"></div>
    
    <div class="content_section">
    	<center>
       <a href="#"><img style="border:0;width:88px;height:31px" src="http://www.w3.org/Icons/valid-xhtml10" alt="Valid XHTML 1.0 Transitional" width="88" height="31" vspace="8" border="0" /></a>
<a href="#"><img style="border:0;width:88px;height:31px"  src="http://jigsaw.w3.org/css-validator/images/vcss-blue" alt="Valid CSS!" vspace="8" border="0" /></a>
	</center>
		<div class="margin_bottom_10"></div>
	</div>
</body>
</html>