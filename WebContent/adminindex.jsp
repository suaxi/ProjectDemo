<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>EpicAdminView</title>
<meta name="keywords" content="Game Website Template, free templates, website templates, CSS, XHTML" />
<meta name="description" content="Game Website Template - download free XHTML/CSS files from cssMoban.com" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="templatemo_wrapper_outer">
<div id="templatemo_wrapper_inner">
	
    <div id="templatemo_banner"></div> <!-- end of banner -->
     
<div id="templatemo_menu">
	    <ul>
            <div class="menu" align="center">
                		<c:if test="${!empty user}">
                			<span>当前用户：<a href="adminindex.jsp">${user.username}</a></span><span><a href="doQuit">退出</a></span>
                		</c:if>
                		</div>
        </ul>
</div><!-- end of menu -->
    
    <div id="templatemo_content_wrapper">

			    <div class="header_01" ><h1>管理员功能</h1></div>
						<ul>
			    		    <h2><a href="doAdminQueryAll">查看所有商品</a></h2>
			    			<h2><a href="scanGame.jsp">搜索游戏</a></h2>
			    		    <h2><a href="AdminAddGame.jsp">添加商品</a></h2>
			    		    <h2><a href="AdminAddBrand.jsp">添加厂商</a></h2>
			    		    <h2><a href="AdminAddCategory.jsp">添加游戏类型<a></h2>
			    		    <h2><a href="doAdminQueryAll">修改商品信息</a></h2>
			    		</ul>
			<div class="content_section"></div>
    	
        <div class="cleaner"></div>    
    </div> <!-- end of content wrapper -->
    
</div>
</div>

 <div id="templatemo_footer">
        Copyright © 2019 <a href="#">Epic</a>
   	</div> <!-- end of footer -->
    <div class="margin_bottom_10"></div>
    
    <div class="content_section">
    	<center>
       <a href="#"><img style="border:0;width:88px;height:31px" src="http://www.w3.org/Icons/valid-xhtml10" alt="Valid XHTML 1.0 Transitional" width="88" height="31" vspace="8" border="0" /></a>
<a href="#"><img style="border:0;width:88px;height:31px"  src="http://jigsaw.w3.org/css-validator/images/vcss-blue" alt="Valid CSS!" vspace="8" border="0" /></a>
	</center>
		<div class="margin_bottom_10"></div>
	</div>
</body>
</html>