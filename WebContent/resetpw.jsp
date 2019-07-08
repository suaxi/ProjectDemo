<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改密码</title>
</head>
<body>
<form action="doReset" method="post">
			<dl>
				<dt>用户名：</dt>
				<dd>
					<input type="text" name="username" />
				</dd>
				<dt>身份证：</dt>
				<dd>
					<input type="text" name="idnumber" />
				</dd>
				<dt>密 码：</dt>
				<dd>
					<input type="password" name="password" />
				</dd>
			</dl>
			<div class="buttons">
			<input type="submit" name="submit" value="提交" />
			
			</div>
		</form>
</body>
</html>