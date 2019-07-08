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
<caption>购物车</caption>
				<tr>
					<th>游戏名</th>
					<th>价格</th>
					<th>数量</th>
				</tr>
<c:forEach var="game" items="${list}">
	<tr>				
					<th>${game.name}</th>
					<th>${game.price}</th>
					<th>${game.count}</th>
					<th><a href="doAddGoodsCount?CartId=${game.id}">+</a></th>
					<th><a href="doSubGoodsCount?CartId=${game.id}">-</a></th>
				</tr>					
</c:forEach>	
</table>
<a href="SureBuy.jsp">购买</a>
</body>
</html>