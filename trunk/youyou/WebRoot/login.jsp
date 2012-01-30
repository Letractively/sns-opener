<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<html>
	<head>
		<meta charset="utf-8">
		<title>youyou网，欢迎您的登录</title>
		<link href="css/style.css" type="text/css" rel="stylesheet" />
		<link rel="Shortcut Icon" href="images/icon.jpg" />
		<style type="text/css">
<!--
#footer {
	clear: both;
	width: 900px;
}

#head {
	height: 70px;
	background: #F5F5F5;
	border-bottom: #E5E5E5 1px solid;
}

#head img {
	float: left;
}

#main,#head {
	margin: 0 auto;
}

#main {
	margin-top: 50px;
	min-height: 400px;
	width: 900px;
}

#left {
	width: 498px;
	height: 300px;
	float: left;
	background: url(images/login_zs.png) no-repeat;
}

#right {
	width: 360px;
	float: right;
	border: 1px #e5e5e5 solid;
	background-color: #f5f5f5;
	padding: 20px;
}

.tip {
	height: 30px;
}

.tip li {
	list-style-type: none;
	color: red;
	
}
-->
</style>
	</head>

	<body>
		<div id="head">
			<img src="images/logo.png" alt="youyouç½	" />
		</div>
		<div id="main">
			<div id="left">
			</div>
			<div id="right">
				<h1>
					<s:property value="#request.msg" />
					请登录
				</h1>
				<form action="userLogin.action" method="post">
					<div class="item">
						注册邮箱:
					</div>
					<input type="text" class="inputarea" name="email" />
					<div class="tip">
					</div>
					<div class="item">
						密码:
					</div>
					<input class="inputarea" type="password" name="pwd" />
					<span class="tip">
						<s:actionerror />
					</span>
					<div>
						<input type="submit" value="登录" />
						还没有youyou网账号，点击
						<a href="register.jsp">注册</a>
					</div>
				</form>
			</div>
		</div>
		<div id="footer">
			©2012&nbsp;
			<a href="#">Youyou</a>-
			<a href="#">条款 </a>-
			<a href="#">内容政策 </a>-
			<a href="#">隐私权</a>
			<a href="#">中文（简体中文）</a>
		</div>
	</body>
	<!-- InstanceEnd -->
</html>
