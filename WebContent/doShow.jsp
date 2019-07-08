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
			<caption>商品列表</caption>
			<tr>
					<th>序号</th>
					<th>商品名</th>
					<th>价格</th>
					<th>数量</th>
				</tr>
<c:forEach var="goods" items="${list}">	
				<tr>
					<th>${goods.id}</th>
					<th>${goods.name}</th>
					<th>${goods.price}</th>
					<th>${goods.count}</th>
				</tr>
</c:forEach>
	
		</table>
</body>
</html>
</body>
</html>