<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加商品</title>
</head>
<body>
<form action="doAdminAdd" method="post">
			<dl>
				<dt>商品名：</dt>
				<dd>
					<input type="text" name="gamename" />
				</dd>
				<dt>厂商：</dt>
				<dd>
					<input type="text" name="brand" />
				</dd>
				<dt>类型：</dt>
				<dd>
					<input type="text" name="category" />
				</dd>
				<dt>价格：</dt>
				<dd>
					<input type="text" name="price" />
				</dd>
				<dt>上架日期：</dt>
				<dd>
					<input type="text" name="startdate" />
				</dd>
				<dt>是否上架：</dt>
				<dd>
					<input type="text" name="status" />
				</dd>
				<dt>简介：</dt>
				<dd>
					<input type="text" name="info" />
				</dd>
			</dl>
			<div class="buttons">
			<input type="submit" name="submit" value="提交" />
			
			</div>
		</form>
</body>
</html>