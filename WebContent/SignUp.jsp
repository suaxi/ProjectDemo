<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<head>
<!-- meta data -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<!--font-family-->
<link
	href="https://fonts.googleapis.com/css?family=Poppins:100,200,300,400,500,600,700,800,900&amp;subset=devanagari,latin-ext"
	rel="stylesheet">

<!-- title of site -->
<title>Sign Up</title>

<!--font-awesome.min.css-->
<link rel="stylesheet" href="css/font-awesome.min.css">

<!--animate.css-->
<link rel="stylesheet" href="css/animate.css">

<!--bootstrap.min.css-->
<link rel="stylesheet" href="css/bootstrap.min.css">

<!-- bootsnav -->
<link rel="stylesheet" href="css/bootsnav.css">

<!--style.css-->
<link rel="stylesheet" href="css/style.css">

<!--responsive.css-->
<link rel="stylesheet" href="css/responsive.css">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->

<!--[if lt IE 9]>
			<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
			<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

</head>

<body>
	<!--[if lte IE 9]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade your browser</a> to improve your experience and security.</p>
        <![endif]-->

	<!-- signin end -->
	<section class="signin signup popup-up">
		<div class="container">

			<div class="sign-content popup-in-content">
				<div class="popup-in-txt">
					<h2>创建账户</h2>

					<div class="row">
						<div class="col-sm-12">
							<div class="signin-form">
								<form action="doRegister" method="post" id="ff">
									<div class="form-group">
										<label for="signin_form">用户名</label> <input type="text"
											class="form-control" name="username" id="name"
											placeholder="Account" onblur="test()"> <span style="font-size:18px" id="sp"></span>
									</div>
									<!--/.form-group -->
									<div class="form-group">
										<label for="signin_form">密码</label> <input type="password"
											class="form-control" name="password" id="p1"
											placeholder="PassWord">
									</div>
									<!--/.form-group -->
									<div class="form-group">
										<label for="signin_form">确认密码</label> <input type="password"
											class="form-control" name="affirm" id="p2"
											placeholder="again PassWord" onblur="cheack()"> <span id="sp1"
											style="color: red;font-size:18px"></span>
									</div>
									<!--/.form-group -->
									<div class="form-group">
										<label for="signin_form">身份证</label> <input type="text"
											class="form-control" name="idnumber" id="signin_form"
											placeholder="ID Number">
									</div>
									<!--/.form-group -->
									<div class="form-group">
										<label for="signin_form">电话</label> <input type="text"
											class="form-control" name="tel" id="signin_form"
											placeholder="Tel">
									</div>
									<!--/.form-group -->
									<div class="form-group">
										<label for="signin_form">Email</label> <input type="email"
											class="form-control" name="email" id="signin_form"
											placeholder="Email">
									</div>
									<!--/.form-group -->
							</div>
							<!--/.signin-form -->
						</div>
						<!--/.col -->
					</div>
					<!--/.row -->

					<div class="row">
						<div class="col-sm-12">
							<div class="signin-password">
								<div class="awesome-checkbox-list">
									<ul class="unstyled centered">

										<li><input class="styled-checkbox" id="styled-checkbox-2"
											type="checkbox" value="value2"> <label
											for="styled-checkbox-2">我已经阅读并同意 <a
												href="https://www.epicgames.com/site/zh-CN/tos">服务条款</a></label></li>

										<li></li>

									</ul>
								</div>
								<!--/.awesome-checkbox-list -->
							</div>
							<!--/.signin-password -->
						</div>
						<!--/.col -->
					</div>
					<!--/.row -->


					<div class="row">
						<div class="col-sm-12">
							<div class="signin-footer">
								<button type="submit" class="btn signin_btn">创建账户</button>
								<p>
									已有账户 ? <a href="SignIn.jsp">登 录</a>
								</p>
							</div>
							<!--/.signin-footer -->
						</div>
						<!--/.col-->
					</div>
					<!--/.row -->
				</div>
				<!-- .popup-in-txt -->
			</div>
			<!--/.sign-content -->
		</div>
		<!--/.container -->

	</section>
	<!--/.signin -->
	</form>

	<!--/form -->
	<!-- signin end -->

	<!--footer copyright start -->
	<footer class="footer-copyright">
		<div id="scroll-Top">
			<i class="fa fa-angle-double-up return-to-top" id="scroll-top"
				data-toggle="tooltip" data-placement="top" title=""
				data-original-title="Back to Top" aria-hidden="true"></i>
		</div>
		<!--/.scroll-Top-->

	</footer>
	<!--/.hm-footer-copyright-->
	<!--footer copyright  end -->


	<!-- Include all js compiled plugins (below), or include individual files as needed -->

	<script src="js/jquery.js"></script>

	<!--modernizr.min.js-->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js"></script>

	<!--bootstrap.min.js-->
	<script src="js/bootstrap.min.js"></script>

	<!-- bootsnav js -->
	<script src="js/bootsnav.js"></script>

	<!-- jquery.sticky.js -->
	<script src="js/jquery.sticky.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>


	<!--Custom JS-->
	<script src="js/custom.js"></script>
	
	<script type="text/javascript">
		function test() {
			//获取input标签的value值
			var name = $("#name").val();
			$.ajax({
				type : "POST",
				url : "doCheack",
				//data:"name="+name+"&password=123",
				data : $("#ff").serialize(),
				dateType : "text",//期望接收的数据类型
				success : function(msg) {//接收响应数据 msg就是响应正文
					//alert("msg"+msg);				
					if (msg == -1) {
						//alert("-1");
						$("#sp").css("color", "red");
						$("#sp").html("用户名已存在！");

					} else if (msg == 0) {
						$("#sp").css("color", "red");
						$("#sp").html("用户名不能为空！");

					} else {
						$("#sp").css("color", "green");
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
			if (p1 != p2) {
				sp1.innerText = "两次密码不一致！"
			} else {
				sp1.innerText = "";
			}
		}
	</script>
</body>

</html>