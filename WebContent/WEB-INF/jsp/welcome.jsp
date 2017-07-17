<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>welcome</title>
<style type="text/css">
@keyframes f{
	
	0%{transform:scale(0.2);opacity: 0;}
	99%{transform:scale(1.01);opacity:1;}
	100%{transform:scale(1);opacity:1;}
}
body {
	background: rgba(0, 0, 0, 0.8);
	min-width: 550px;
}

* {
	margin: 0px;
	padding: 0px;
}
#banner{
	width:500px;
	height:600px;
	background: rgba(255, 255, 255, 0.9);
	border-radius:10px;
	margin:100px auto;
	position:relative;
}

#h2{
	font-weight:bold;
	font-size:30px;
}

#login_out{
	position:absolute;
	top:500px;
	left:100px;
	margin-top: 10px;
	width : 300px;
	height: 50px;
	border: none;
	outline: none;
	cursor: pointer;
	width: 300px;
	font-size: 20px;
}
#login_out:HOVER {
	background: rgba(0, 0, 0, 0);
	border: 1px solid rgba(0, 0, 0, 0.5);
}
</style>
</head>
<body>
	<div id="banner" >
		<p id="h2">学生信息</p>
		<p>學號:${student2.userid}</p>
		<p>姓名:${student2.username}</p>
		<p>班級:${student2.classid}</p>
		<input id="login_out" type="button" value="login out" />
	</div>
	
	<script type="text/javascript">
	
	window.onload=function(){
		var banner=document.getElementById("banner");
		banner.style.cssText="animation: f 0.6s";
		var but=document.getElementById("login_out");
		but.onmousedown=function(){
			window.location="index.jsp";
		}
	}
	
	</script>
</body>
</html>