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
		<link id="theme" href="css/theme_0.css" type="text/css"
			rel="stylesheet" />
		<link rel="Shortcut Icon" href="images/icon.jpg" />
		<script type="text/javascript" src="js/ajax.js">
</script>
		<SCRIPT type="text/javascript">
			
			$("theme").setAttribute("href",baseURL+"css/theme_<s:property value="#session.user.themeId" />.css");
			
		</SCRIPT>
		<style type="text/css">
<!-- /* 这里是针对微博条目的css */
.twittermsg {
	margin: 10px auto;
	width: 780px;
	border-bottom: 1px dotted #00f;
	padding: 10px;
}

.twitterhead {
	width: 700px;
	float: right;
}

.maincontent {
	min-height: 45px;
}

.twittermsg img {
	float: left;
	margin-right: 10px;
	padding: 2px;
	border: 1px solid #999;
}

.control {
	clear: both;
	float: right;
	font-size: 12px;
	color: #666666;
}

.control a {
	margin-left: 10px;
}

/* 这是微博tab部分的css*/
BODY {
	FONT-SIZE: 14px;
	FONT-FAMILY: "宋体"
}

OL LI {
	MARGIN: 8px
}

#con {
	FONT-SIZE: 12px;
	MARGIN: 0px auto;
	WIDTH: 800px
}

#tags {
	PADDING-RIGHT: 0px;
	PADDING-LEFT: 0px;
	PADDING-BOTTOM: 0px;
	MARGIN: 0px 0px 0px 10px;
	WIDTH: 400px;
	PADDING-TOP: 0px;
	HEIGHT: 23px
}

#tags LI {
	BACKGROUND: url(images/tagleft.gif) no-repeat left bottom;
	FLOAT: left;
	MARGIN-RIGHT: 1px;
	LIST-STYLE-TYPE: none;
	HEIGHT: 23px
}

#tags LI A {
	PADDING-RIGHT: 10px;
	PADDING-LEFT: 10px;
	BACKGROUND: url(images/tagright.gif) no-repeat right bottom;
	FLOAT: left;
	PADDING-BOTTOM: 0px;
	COLOR: #999;
	LINE-HEIGHT: 23px;
	PADDING-TOP: 0px;
	HEIGHT: 23px;
	TEXT-DECORATION: none
}

#tags LI.emptyTag {
	BACKGROUND: none transparent scroll repeat 0% 0%;
	WIDTH: 4px
}

#tags LI.selectTag {
	BACKGROUND-POSITION: left top;
	MARGIN-BOTTOM: -2px;
	POSITION: relative;
	HEIGHT: 25px
}

#tags LI.selectTag A {
	BACKGROUND-POSITION: right top;
	COLOR: #000;
	LINE-HEIGHT: 25px;
	HEIGHT: 25px
}

#tagContent {
	PADDING-RIGHT: 1px;
	BORDER-TOP: #aecbd4 1px solid;
	PADDING-BOTTOM: 1px;
	PADDING-TOP: 1px;
	BACKGROUND-COLOR: #fff
}

.tagContent {
	DISPLAY: none;
	WIDTH: 799px;
	COLOR: #474747;
	HEIGHT: 250px;
}

#tagContent DIV.selectTag {
	DISPLAY: block
}
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
					<a
						href="getAllTwitterIConcern.action?uid=<s:property value="#session.user.id" />"
						target="_blank">
						<li>
							首页
						</li> </a>
					<a href="picture.jsp" target="_blank">
						<li>
							照片
						</li> </a>
					<li class="nav_current">
						个人资料
					</li>
					<a
						href="getAllUserIConcern.action?uid=<s:property value="#session.user.id" />"
						target="_blank">
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
					<span><a href="register.jsp">注册</a> </span>
				</div>
			</div>
		</div>
		<div id="wrapper">
			<!-- InstanceBeginEditable name="wrapper" -->
			<h1>
				我的个人资料
			</h1>
			<span>昵称：<s:property value="#session.user.name" /> </span>
			<br />
			<span>邮箱:<s:property value="#session.user.email" /> </span>
			<br />
			<br />
			<h1>
				我发送的微博
			</h1>
			<div style="clear: both"></div>
			<DIV id=con>
				<UL id=tags>
					<LI class=selectTag>
						<A onClick="selectTag('tagContent0',this)"
							href="javascript:void(0)">全部</A>
					</LI>
					<LI>
						<A onClick="selectTag('tagContent1',this)"
							href="javascript:void(0)">挚友</A>
					</LI>
					<LI>
						<A onClick="selectTag('tagContent2',this)"
							href="javascript:void(0)">熟悉的陌生人</A>
					</LI>
				</UL>
				<DIV id=tagContent>
					<DIV class="tagContent selectTag" id=tagContent0>
						<s:iterator value="#request.allTwitter">
							<div class="twittermsg">
								<div>
									<img src="images/headImage.jpg" alt="" />
								</div>
								<div class="twitterhead">
									<div class="maincontent">
										<s:property value="content" />
									</div>
									<div class="control">
										<a href="#">回复</a><a href="#">删除</a><a href="#">取消关注</a>
									</div>
								</div>
								<div class="clear"></div>
							</div>
						</s:iterator>

					</DIV>
					<DIV class="tagContent " id=tagContent1>
						第二个标签的内容
					</DIV>
					<DIV class=tagContent id=tagContent2>
						第三个标签的内容
					</DIV>
				</DIV>
			</DIV>
			<SCRIPT type=text/javascript>
			function selectTag(showContent,selfObj){
				// 操作标签
				var tag = document.getElementById("tags").getElementsByTagName("li");
				var taglength = tag.length;
				for(i=0; i<taglength; i++){
					tag[i].className = "";
				}
				selfObj.parentNode.className = "selectTag";
				// 操作内容
				for(i=0;i<taglength;i++){
					document.getElementById("tagContent"+i).style.display="none";
				}
				
				document.getElementById(showContent).style.display = "block";
				
			}
			</SCRIPT>
			<!-- InstanceEndEditable -->
		</div>
		<div class="clear"></div>
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
