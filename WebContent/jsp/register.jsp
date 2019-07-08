<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>海文 在线短信平台</title>
<link type="text/css" rel="stylesheet" href="css/sms.css" />
</head>
<body>
<div id="regTitle" class="png"></div>
	<div id="regForm" class="userForm png">

		<form action="doRegister" method="post">
			<dl>
				<div id="error">错误信息</div>
				<dt>用 户 名：</dt>
				<dd>
					<input type="text" name="username" id="un" onblur="test()" />
					<span id="sp" style="color:red;"></span>
				</dd>
				<dt>密 码：</dt>
				<dd>
					<input type="password" name="password" />
				</dd>
				<!-- <dt>确认密码：</dt>
				<dd>
					<input type="password" name="affirm" id="p2" onblur="cheack()" />
					<span id="sp1" style="color:red;"></span>
				</dd> -->
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
	function test(){
		//以平台兼容的方式获取XMLHttpRequest对象
		var xmlHttp;
		try{
			xmlHttp=new XMLHttpRequest();
		}catch (e){
			try{
				xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
			}catch (e){
				try{
					xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
				}catch (e){
					alert("您的浏览器不支持AJAX！");
					return false;
				}
			}
		}
	
	//服务器向浏览器响应请求
	xmlHttp.onreadystatechange=function(){
		//alert(xmlHttp.readyState)
		if(xmlHttp.readyState==4){
			//alert(xmlHttp.status);//查看服务器端响应状态
			if(xmlHttp.status==200){//服务器响应一切正常
				//找到span标签
				var sp=document.getElementById("sp");
				//设置响应正文数据
				sp.innerText=xmlHttp.responseText;
			}
		}
	}
	//获取input标签的value值
	var name=document.getElementById("un").value;
	//准备
	//xmlHttp.open("get","doCheack?name="+name,true);
	xmlHttp.open("post","doCheck",true);
	//post提交需要拼接请求协议
	xmlHttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	//发送请求
	//xmlHttp.send(null)
	xmlHttp.send("name="+name);
	
	}
	
	function cheack(){
		//alert("123")
		//获取input标签的value值
		var p1=document.getElementById("p1").value;
		var p2=document.getElementById("p2").value;
		//找到span标签
		var sp1=document.getElementById("sp1");
		if(p1!=p2){
			sp1.innerText="两次密码不一致！"
		}else{
			sp1.innerText="";
		}
	}
	
	</script>
</body>
</html>