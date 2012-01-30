<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<html>
	<head>
		<meta charset="utf-8">
		<title>谢谢您的注册</title>
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
	width: 900px;
}

#left {
	width: 454px;
	float: left;
	border: 1px #e5e5e5 solid;
	background-color: f5f5f5;
	padding: 20px;
}

#right {
	width: 360px;
	height: 300px;
	float: right;
	border: 1px #e5e5e5 solid;
	background-color: f5f5f5;
	padding: 20px;
}

.tip {
	height: 30px;
}

.tip li {
	list-style-type: none;
	color: red;
}

.radio {
	margin-left: 30px;
}
-->
</style>
	</head>

	<body>
		<div id="head">
			<img src="images/logo.png" alt="youyou网	" />
		</div>
		<div id="main">
			<div id="left">
				<h1 class="name">
					用户注册
				</h1>

				<form action="userRegister.action" method="post">
					<div class="item">
						昵称：
					</div>
					<input type="text" class="inputarea" name="name" />
					<div class="tip">
						<s:fielderror fieldName="name"></s:fielderror>
					</div>
					<div class="item">
						密码：
					</div>
					<input class="inputarea" type="password" name="pwd" />
					<div class="tip">
						<s:fielderror fieldName="pwd"></s:fielderror>
					</div>
					<div class="item">
						再次输入密码：
					</div>
					<input class="inputarea" type="password" name="toopwd" />
					<div class="tip">
						<s:fielderror fieldName="pwd"></s:fielderror>
					</div>
					<div class="item">
						邮箱：
					</div>
					<input type="text" class="inputarea" name="email" />
					<div class="tip">
						<s:fielderror fieldName="email"></s:fielderror>
					</div>
					<div class="item">
						性别：
					</div>
					<input class="radio" type="radio" name="isMan" value="true"
						checked="checked" />
					男
					<input class="radio" type="radio" name="isMan" value="false">
					女
					<div class="tip"></div>
					<input type="submit" value="注册" />
				</form>
			</div>
			<div id="right">
				<h1 class="name">
					用户登录
				</h1>
				<form action="userLogin.action" method="post">
					<div class="item">
						用户邮箱：
					</div>
					<input type="text" class="inputarea" name="email" />

					<div class="item">
						密码：
					</div>
					<input class="inputarea" type="password" name="pwd" />
					<div>
						<input type="submit" value="登录" />
						还没有youyou网账号，点击
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
</html>
