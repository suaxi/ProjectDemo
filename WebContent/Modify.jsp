<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
			<div id="regTitle" class="png"></div>
	<div id="regForm" class="userForm png">
		<form action="doModifyGameInfo" method="post">
			<dl>
				<dt>游戏编号</dt>
				<dd>
					<input type="text" name="id" value="${game[0].id}"/>
				</dd>
				<dt>游戏名</dt>
				<dd>
					<input type="text" name="name" value="${game[0].name1}"/>
				</dd>
				<dt>发行商</dt>
				<dd>
					<input type="text" name="brand_id" value="${game[0].name2}"/>
				</dd>
				<dt>游戏类型</dt>
				<dd>
					<input type="text" name="category_id" value="${game[0].name3}"/>
				</dd>
				<dt>价格</dt>
				<dd>
					<input type="text" name="price" value="${game[0].price}"/>
				</dd>
				<dt>发行日期</dt>
				<dd>
					<input type="text" name="start_date" value="${game[0].start_date}"/>
				</dd>
				<dt>上架状态</dt>
				<dd>
					<input type="text" name="status" value="${game[0].status}"/>
				</dd>
				<dt>游戏简介</dt>
				<dd>
					<input type="text" name="infor" value="${game[0].infor}"/>
				</dd>
				<dt>销售数量</dt>
				<dd>
					<input type="text" name="count" value="${game[0].count}"/>
				</dd>
			</dl>
			<div class="buttons">
				<input type="submit" name="submit" value="提交" />
				<input type="reset" name="reset" value="重置" />
			</div>
			<div class="goback">
				<a href="ChangeView.html" class="png">返回上一届面</a>
			</div>
		</form>
	</div>
	</body>
</html>
