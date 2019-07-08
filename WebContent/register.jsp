<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Epic商店</title>

<script type="text/javascript" src="scripts/jquery.js"></script>
<link type="text/css" rel="stylesheet" href="css/sms.css" />
</head>
<body>
	<div id="regTitle" class="png"></div>
	<div id="regForm" class="userForm png">
		<form action="doRegister" method="post" id="ff">
			<dl>
				<div id="error"></div>
				<dt>用 户 名：</dt>
				<dd>
					<input type="text" name="username" id="name" onblur="test()" /><br/>
					<span id="sp"></span>
				</dd>
				
				<dt>密 码：</dt>
				<dd>
					<input type="password" name="password" id="p1"/>
				</dd>
				<dt>确认密码：</dt>
				<dd>
					<input type="password" name="affirm" id="p2" onblur="cheack()"/><br/>
					<span id="sp1" style=" color: red;"></span>
				</dd>
				<dt>身份证：</dt>
				<dd>
					<input type="text" name="idnumber" />
				</dd>
				<dt>电话：</dt>
				<dd>
					<input type="text" name="tel" />
				</dd>
				<dt>邮 箱：</dt>
				<dd>
					<input type="text" name="email" />
				</dd>
			</dl>
			<div class="buttons">
				<input class="btn-reg png" type="submit" name="register" value=" " /><input
					class="btn-reset png" type="reset" name="reset" value=" " />
			</div>
			<div class="goback">
				<a href="index.jsp" class="png">返回登录页</a>
			</div>
		</form>
	</div>

	<script type="text/javascript">
	

	function test() {
		//获取input标签的value值
		var name = $("#name").val();
		$.ajax({
			type:"POST",
			url:"doCheack",
			//data:"name="+name+"&password=123",
			data:$("#ff").serialize(),			
			datetype:"text",//期望接收的数据类型
			success:function(msg){//接收响应数据 msg就是响应正文
				alert("msg"+msg);				
				if(msg==-1){
					//alert("-1");
					$("#sp").css("color","red"); 
					$("#sp").html("用户名已存在！"); 

				}else if(msg==0){
					 $("#sp").css("color","red"); 
					 $("#sp").html("用户名不能为空！"); 					
	 
				}else{
					 $("#sp").css("color","green"); 
					 $("#sp").html("用户名可用！"); 	
				}
			}
		})
	}
		
		function cheack() {
			//alert("123");
			//获取input标签的value值
			var p1 = document.getElementById("p1").value;
			var p2 = document.getElementById("p2").value;
			//找到span标签
			var sp1 = document.getElementById("sp1");
			if(p1!=p2){
				sp1.innerText="两次密码不一致！"
			}else{
				sp1.innerText="";
			}
		}
		
		
	</script>
</body>
</html>