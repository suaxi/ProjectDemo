<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1px" cellspacing="0" >
<caption>游戏列表</caption>
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
</body>
</html>