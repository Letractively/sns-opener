<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>My JSP 'test.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<script type="text/javascript" src="js/ajax.js">
</script>

	</head>

	<body>

		<!-- 
	
		<div id="twitter">
			<textarea id="twitterinput" autocomplete="off" spellcheck="false"
				name="twitterContent"></textarea>
			<div>
				<img id="loadingImg" src="images/loading.gif"
					style="float: right; visibility: hidden; margin-top: 3px;" />
				<input id="twittersubmit" type="button" value="发布">
			</div>
		</div>
		<script type="text/javascript">
		
		var twittersubmit = $("twittersubmit");
		var loadingImg = $("loadingImg");
		var twitterinput = $("twitterinput");
		
		twittersubmit.onclick = function() {
			
			twittersubmit.setAttribute("disabled", "disabled");
			twitterinput.setAttribute("disabled", "disabled");
			loadingImg.style.visibility="visible"
			

			post("sendTwitter.action", "twitterContent=" + twitterinput.value,
					function() {
						if (ajax.readyState == 4) {
							twittersubmit.removeAttribute("disabled");
							twitterinput.removeAttribute("disabled");
							loadingImg.style.visibility = "hidden";

							alert(ajax.responseText);
						}
					}
			);
		
		}
		</script>
		
		 -->
		<div id="tagContent1"></div>
		<script type="text/javascript">
post("getAllUserConcernMeJSON.action","",function(){
						ajax.responseText
						var result=textToJSON(ajax.responseText);
						var toWrite="";
						for(var i=0;i<result.length;i++){
							toWrite+="<div class=circleitem><div><img src=images/headImage.jpg /></div><div class=twitterhead><div class=maincontent>"+result[i].name  +"<div class=control><a href=#>分组</a><a href=#>删除</a><a href=#>发送消息</a></div></div><div style=clear: both></div></div>";
						
						}
						var tagContent1=$("tagContent1");
						tagContent1.innerHTML=toWrite;


					});
					</script>

	</body>
</html>
