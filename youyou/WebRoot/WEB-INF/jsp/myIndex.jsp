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
		<
		<link id="theme" href="css/theme_0.css" type="text/css"
			rel="stylesheet" />
		<link rel="Shortcut Icon" href="images/icon.jpg" />
		<script type="text/javascript" src="js/ajax.js">
</script>
		<SCRIPT type="text/javascript">
			
			$("theme").setAttribute("href",baseURL+"css/theme_<s:property value="#session.user.themeId" />.css");
			
		</SCRIPT>
		<style type="text/css">
<!-- /* 这里是针对内容总体布局的样式 */
#wrapper {
	background-color: #F5F5F5;
}

#ad {
	margin: 0 auto;
	margin-top: 35px;
	width: 800px;
	height: 0px;
	background: #660000;
}

#tip {
	margin: 0 auto;
	width: 800px;
	height: 0px;
	background: #0F0;
}

#left {
	width: 598px;
	min-height: 700px;
	float: right;
	border-left: #E5E5E5 solid 1px;
	border-right: #E5E5E5 solid 1px;
	background-color: #FFF;
	padding-bottom: 50px;
}

#right {
	width: 200px;
	min-height: 700px;
	float: right;
	background-color: #F5F5F5;
}

#left_head {
	width: 598px;
	height: 150px;
}

#host {
	width: 150px;
	height: 150px;
	float: left;
	padding-top: 5px;
}

#host img {
	padding: 2px;
	border: 1px solid #999;
	margin-left: 24px;
	margin-top: 5px;
}

#twitter {
	width: 428px;
	height: 150px;
	float: left;
	padding: 10px;
}

#twitterinput {
	width: 428px;
	height: 80px;
	float: right;
	overflow: hidden;
}

#loadingImg {
	float: right;
	visibility: hidden;
	margin-top: 3px;
}

#twittersubmit {
	float: right;
}

/* 这里是针对微博条目的css */
.twittermsg {
	margin: 10px;
	width: 557px;
	border-bottom: 1px dotted #00f;
	padding: 10px;
}

.twittermsg img {
	float: left;
	margin-right: 10px;
	padding: 2px;
	border: 1px solid #999;
}

.twitterhead {
	width: 490px;
	float: right;
}

.maincontent {
	min-height: 45px;
}

.twittermsg {
	font-size: 14px;
}

.control {
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

#con {
	FONT-SIZE: 12px;
	WIDTH: 598px
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
	WIDTH: 597px;
	COLOR: #474747;
	HEIGHT: 250px;
}

#tagContent DIV.selectTag {
	DISPLAY: block
}

/*  主题更换部分css */
#themeDiv {
	width: 200px;
	overflow: hidden;
	margin-top: 10px;
	margin-bottom: 10px;
	padding-top: 10px;
}

#bg_title {
	border-bottom: 1px solid #ff0000;
	padding-left: 10px;
}

#themeUL {
	width: 140px;
	height: 12px;
	list-style-type: none;
	margin: 0 auto;
	margin-top: 10px;
}

#themeUL li {
	display: block;
	float: left;
	margin-left: 3px;
	width: 10px;
	height: 10px;
	background-image: url("images/skinbt.png");
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

					<li class="nav_current">
						首页
					</li>
					<a href="picture.jsp?uid=<s:property value="#session.user.id" />"
						target="_blank">
						<li>
							照片
						</li> </a>
					<a
						href="getAllTwitterIPublished.action?uid=<s:property value="#session.user.id" />"
						target="_blank">
						<li>
							个人资料
						</li> </a>
					<a
						href="getAllUserIConcern.action?uid=<s:property value="#session.user.id" />"
						target="_blank">
						<li>
							圈子
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
			<div id="left">
				<div id="left_head">
					<div id="host">
						<img src="images/host.png" alt="我就是我">
					</div>
					<div id="twitter">
						<textarea id="twitterinput" autocomplete="off" spellcheck="false"
							name="twitterContent"></textarea>
						<div>
							<img id="loadingImg" src="images/loading.gif" />
							<input id="twittersubmit" type="submit" value="发布">
						</div>
						<script type="text/javascript">
var twittersubmit = $("twittersubmit");
var loadingImg = $("loadingImg");
var twitterinput = $("twitterinput");

twittersubmit.onclick = function() {

	twittersubmit.setAttribute("disabled", "disabled");
	twitterinput.setAttribute("disabled", "disabled");
	loadingImg.style.visibility = "visible"

	post(
			"sendTwitter.action",
			"twitterContent=" + twitterinput.value,
			function() {
				var re = eval("(" + ajax.responseText + ")");
				if (re.result == "success") {

					twittersubmit.removeAttribute("disabled");
					twitterinput.removeAttribute("disabled");
					loadingImg.style.visibility = "hidden";
					twitterinput.style.background = "url(images/publishSuccess.png) center no-repeat";
					setTimeout(function() {
						twitterinput.style.background = "";
					}, 800, null, null);
					twitterinput.value = "";
				}

			});

}
</script>
					</div>

				</div>
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
						<DIV class="tagContent   selectTag" id=tagContent0>
							<s:iterator value="#request.allTwitterIConcern">
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
						<DIV class="tagContent" id=tagContent1>
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
			</div>
			<aside id="right">
			<div>
				我发送的微博数:
				<s:property value="#session.user.twitterNumIPublish" /><br />
				关注我的人数:
				<s:property value="#session.user.concernMeNum" />
			</div>
			<div id="themeDiv">
				<div id="bg_title">
					更换主题:
				</div>
				<ul id="themeUL">
					<li id="l1">
					</li>
					<li id="l2">
					</li>
					<li id="l3">
					</li>
					<li id="l4">
					</li>
					<li id="l5">
					</li>
					<li id="l6">
					</li>
					<li id="l7">
					</li>
					<li id="l8">
					</li>
					<li id="l9">
					</li>
					<li id="l10">
					</li>
				</ul>
			</div>
			<script>
var lis = $("themeUL").getElementsByTagName("li");
var current_clicked= <s:property value="#session.user.themeId" />;
lis[current_clicked].style.backgroundPositionX = "-14px";
for ( var i = 0; i < lis.length; i++) {
	lis[i].style.backgroundPositionY = "-" + i * 11 + "px";
	lis[i].onclick = function() {

		function change() {
			var re=eval("("+ajax.responseText+")");
			if(re.result=="success"){
				lis[current_clicked].style.backgroundPositionX = "0px";
				$("l" + (args + 1)).style.backgroundPositionX = "-14px";
				current_clicked = args;
				$("theme").setAttribute("href",baseURL+"css/theme_"+args+".css");
			}
			
		}
		//在这里发起post 请求
		var args = (this.id.substring(1, this.id.length) - 1);
		post("changeTheme.action", "themeId=" + args, change);

	}
}
</script>


			</aside>
			<!-- InstanceEndEditable -->
			<div class="clear">
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
