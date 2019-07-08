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
<caption>我的游戏</caption>
				<tr>
					<th>游戏名</th>
					<th>购买日期</th>
				</tr>
<c:forEach var="game" items="${list}">
				<tr>				
					<th>${game.name}</th>
					<th>${game.buy_date}</th>
				</tr>				
</c:forEach>
</table>
</body>
</html>