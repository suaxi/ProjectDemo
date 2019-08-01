<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html>
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
<title>Admin Add Category Info</title>

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
					<h2>管理员添加游戏类型</h2>

					<div class="row">
						<div class="col-sm-12">
							<div class="signin-form">
								<form id="ff">							
									<div class="form-group">
										<label for="signin_form">请输入游戏类型：</label> 
										<input type="text" class="form-control" name="category" />
									</div>
							</div>
							<!--/.signin-form -->
						</div>
						<!--/.col -->
					</div>
					<!--/.row -->

					<div class="row">
						<div class="col-sm-12">
							<div class="signin-footer">
								<button id="btn" class="btn signin_btn" onclick="test()">提交</button>
							<p>
									<a href="adminindex.jsp">返回上一层</a>
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
			var btn = $("#btn").val();
			$.ajax({
				type : "POST",
				url : "doAddCategory",
				//data:"name="+name+"&password=123",
				data : $("#ff").serialize(),
				dataType : "text",//期望接收的数据类型
				success : function(msg) {//接收响应数据 msg就是响应正文
					//alert("msg"+msg);				
					if (msg == 1) {
						alert("添加成功！");
					} else {
						alert("添加失败！");
					}
				}
			})
		}

	</script>
</body>
</html>