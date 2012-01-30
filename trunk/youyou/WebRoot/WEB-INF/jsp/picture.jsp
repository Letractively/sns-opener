<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<html>
	<!-- InstanceBegin template="/Templates/template_all.dwt" codeOutsideHTMLIsLocked="false" -->
	<head>
		<meta charset="utf-8">
		<!-- InstanceBeginEditable name="doctitle" -->
		<title>youyou网，欢迎您</title>
		<!-- InstanceEndEditable -->
		<!-- InstanceBeginEditable name="head" -->
		<link href="css/style.css" type="text/css" rel="stylesheet" />
		<link href="css/theme_defalut.css" type="text/css" rel="stylesheet" />
		<link rel="Shortcut Icon" href="images/icon.jpg" />
		<SCRIPT type="text/javascript" src="js/ajax.js"></SCRIPT>
		<SCRIPT type="text/javascript">
			
			$("theme").setAttribute("href",baseURL+"css/theme_<s:property value="#session.user.themeId" />.css");
			
		</SCRIPT>
		<style type="text/css">
<!--
-->
</style>
		<!-- InstanceEndEditable -->
	</head>

	<body>

		<div id="global_header">
			<div id="header">
				<a href="#"> <img src="images/logo.png" /> </a>
				<!-- InstanceBeginEditable name="nav" -->
				<ul id="nav">
					<a href="myIndex.jsp" target="_blank">
						<li>
							首页
						</li> </a>
						<li class="nav_current">
							照片
						</li> 
					<a href="me.jsp" target="_blank">
						<li>
							个人资料
						</li> </a>
					<a href="circle.jsp" target="_blank">
						<li>
							圈子
						</li> </a>
				</ul>
				<!-- InstanceEndEditable -->
				<input id="search" autocomplete="off" type="text" maxlength="2048"
					name="q" label="搜索" placeholder="搜索" dir="" aria-haspopup="true">
				<div id="mes_log_reg">
					<span><s:property value="#session.user.name" />,欢迎您</span>
					<span><a href="#">消息</a> </span>
					<span><a href="register.jsp">注册</a> </span>
				</div>
			</div>
		</div>
		<div id="wrapper">
			<!-- InstanceBeginEditable name="wrapper" -->
			<!-- InstanceEndEditable -->
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