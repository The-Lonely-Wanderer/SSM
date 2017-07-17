<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index Page</title>
<style type="text/css">
body {
	background: rgba(0, 0, 0, 0.8);
}
* {
	margin: 0px;
	padding: 0px;
}
#login {
	position: absolute;
	left: -500px;
	top: 80px;
	width: 250px;
	height: 100px;
	border: 1px solid rgba(255, 255, 255, 0.5);
	outline: none;
	border-radius: 3px;
	background: rgba(255, 255, 255, 0.5);
	cursor: pointer;
	opacity:0;
	transition: 0.5s;
}

#registr {
	width: 250px;
	height: 100px;
	border: 1px solid rgba(255, 255, 255, 0.5);
	outline: none;
	border-radius: 3px;
	background: rgba(255, 255, 255, 0.5);
	cursor: pointer;
	position: absolute;
	left: 800px;
	top: 80px;
	opacity:0;
	transition: 0.5s;
}

#banner {
	width: 600px;
	height: 250px;
	position: relative;
	margin: 350px auto;
}

#registr:hover, #login:hover {
	transform: scale(1.2);
}
</style>
</head>
<body>
	<div id="banner">
		<input type="button" value="Login in" id="login" onclick="login()" />
		<input type="button" value="Registr" id="registr" onclick="registr()" />
	</div>
	<script type="text/javascript">
		window.onload = function() {
			var login=document.getElementById("login");
			var registr=document.getElementById("registr");
			login.style.left="25px";
			login.style.opacity="1";
			registr.style.left="325px";
			registr.style.opacity="1";
		}
		function login() {
			window.location = "login.action"
		};
		function registr() {
			window.location = "registr.action"
		};
	</script>
</body>
</html>