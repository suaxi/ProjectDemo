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
<caption>订单信息</caption>
				<tr>
					<th>订单编号</th>
					<th>用户</th>
					<th>游戏</th>
					<th>购买日期</th>
					<th>价格</th>
				</tr>
<c:forEach var="recode" items="${list}">
<tr>
					<th>${recode.id}</th>
					<th>${recode.name1}</th>
					<th>${recode.name2}</th>
					<th>${recode.buy_date}</th>
					<th>${recode.price}</th>
				</tr>				
</c:forEach>
</table>
</body>
</html>