<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>搜索游戏</title>
</head>
<body>
<form action="doscanGame" method="post">
			<dl>
				<dt>游戏名：</dt>
				<dd>
					<input type="text" name="gameName" />
				</dd>
			</dl>
			<div class="buttons">
			<input type="submit" name="submit" value="提交" />
			
			</div>
		</form>
</body>
</html>