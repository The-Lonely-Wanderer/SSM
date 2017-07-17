<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registr Page</title>
<style type="text/css">
@keyframes f{
	0%{transform:scale(0.2);}
	99%{transform:scale(1.01);}
	100%{transform:scale(1);}
}
body {
	background: rgba(0, 0, 0, 0.8);
}

* {
	margin: 0px;
	padding: 0px;
}

#registr {
	width: 500px;
	height: 600px;
	position: relative;
	margin: 100px auto;
	background: rgba(255, 255, 255, 0.9);
	border-radius: 10px;
}

#banner {
	width: 300px;
	height: 600px;
	border: 1px solid rgba(0,0,0,0);
	margin: 100px auto;
}

p {
	margin-top: 45px;
	font-size: 25px;
	font-family: microsoft yahei;
}

#username, #password, #classid {
	margin-top: 15px;
	width: 300px;
	height: 50px;
	border: none;
	outline:none;
	border-bottom: 1px dashed rgba(0, 0, 0, 0.5);
	background: rgba(0, 0, 0, 0);
	font-size:30px;
	color:rgba(0, 0, 0, 0.5);
	
}

#registrto,#back {
	margin-top: 10px;
	 width : 300px;
	height: 50px;
	border: none;
	outline: none;
	cursor: pointer;
	width: 300px;
	font-size: 20px;
}
#registrto:hover,#back:hover{
	background: rgba(0, 0, 0, 0);
	border: 1px solid rgba(0, 0, 0, 0.5);
}
</style>
</head>
<body>
	<form id="registr" action="registrto.action" method="post">
		<div id="banner">
			<p>用戶名</p>
			<input id="username" type="text" name="username" placeholder="用戶名">
			<p>密碼</p>
			<input id="password" type="password" name="password" placeholder="密碼">
			<p>班級編號</p>
			<input id="classid" type="text" name="classid" placeholder="班級編號"><br />
			<input id="registrto" type="submit" value="Registr"> <br />
			<input id="back" type="button" value="Back" onclick="javascript:window.location='index.jsp'"><br/>
			 ${message}
		</div>
	</form>
	
	<script type="text/javascript">
		window.onload=function(){
			
			var registr=document.getElementById("registr");
			registr.style.cssText="animation: f 0.6s";
			
			
		}
	</script>
</body>
</html>