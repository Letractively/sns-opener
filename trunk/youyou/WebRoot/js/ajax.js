/**
 * 
 * 返回XMLHttpRequest对象
 * @return {XMLHttpRequest} 
 */
function createAjax() {
	var request = false;

	//window对象中有XMLHttpRequest存在就是非IE，包括（IE7，IE8）
	if (window.XMLHttpRequest) {
		request = new XMLHttpRequest();

		if (request.overrideMimeType) {
			request.overrideMimeType("text/xml");
		}

		//window对象中有ActiveXObject属性存在就是IE
	} else if (window.ActiveXObject) {

		var versions = [ 'Microsoft.XMLHTTP', 'MSXML.XMLHTTP',
				'Msxml2.XMLHTTP.7.0', 'Msxml2.XMLHTTP.6.0',
				'Msxml2.XMLHTTP.5.0', 'Msxml2.XMLHTTP.4.0',
				'MSXML2.XMLHTTP.3.0', 'MSXML2.XMLHTTP' ];

		for ( var i = 0; i < versions.length; i++) {
			try {
				request = new ActiveXObject(versions[i]);

				if (request) {
					return request;
				}
			} catch (e) {
				request = false;
			}
		}
	}
	return request;

}
//网站的域名
var baseURL = "http://localhost:8080/youyou/";
var ajax = createAjax();
//ajax调用
function post(action, args, callBack) {
	url = baseURL + action;
	ajax.onreadystatechange = function() {
		if (ajax.readyState == 4) {
			if (ajax.status == 200) {
				callBack();
			} else {
				alert("网络连接出现异常或者网站出现未知错误");
			}
		}
	}
	ajax.open("POST", url, true);
	ajax.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	ajax.send(args);
}
//用id取得对象元素
function $(id) {
	return document.getElementById(id);
}
function textToJSON(text) {
	return eval("(" + text + ")");
}