<%@page import="java.net.URLEncoder"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">   
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" 
      integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ"
      crossorigin="anonymous">  
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<style>
		.login-btn {
			clear: black;
			background-color: #FFC312
			width:100px;
		}
		.login-btn:hover {
			clear: white;
			background-color: black;
		}
		.input-group-prepend span {
			color: black;
			border-left-color: : #FF312;
			width: 40px;
			border: 0 !important;
		}
	</style>
</head>

<%
	String p = request.getParameter("p");
	String f = request.getParameter("f");
	
	String q = "";
	try {
		q = URLEncoder.encode((String) request.getParameter("q"));		
	} catch(Exception e) {
		q = "";
	}
%>
<c:set var="p" value="<%=p%>"/>
<c:set var="f" value="<%=f%>"/>
<c:set var="q" value="<%=q%>"/>

<body>
	<div class="container" align="center">
		<div class="jumbotron"><h1>회원가입</h1></div>

		<form action="memberJoin.mem?p=${p}&f=${f}&q=${q}" method="post" class="form-group">
			<div class="form-group input-group">
				<div class="input-group-prepend"><span class="input-group-text">id</span></div>
				<input type="text" class="form-control" name="member_id" id="member_id" value="html5" required placeholder="아이디입력...."/>
			</div>
			<div class="form-group input-group">
				<div class="input-group-prepend"><span class="input-group-text">pw</span></div>
				<input type="password" class="form-control" name="member_pw" id="member_pw" required placeholder="비번입력...."/>
			</div>
			<div class="form-group input-group">
				<div class="input-group-prepend"><span class="input-group-text">name</span></div>
				<input type="text" class="form-control" name="member_name" id="member_name" value="html5" required placeholder="이름입력...."/>
			</div>
			<div class="form-group input-group">
				<div class="input-group-prepend"><span class="input-group-text">gender</span></div>
				<input type="text" class="form-control" name="member_gender" id="member_gender" required placeholder="M(남)/W(여)"/>
			</div>
			<div class="form-group input-group">
				<div class="input-group-prepend"><span class="input-group-text">age</span></div>
				<input type="number" class="form-control" name="member_age" id="member_age" min="10" max="99" required/>
			</div>
			<div class="form-group input-group">
				<div class="input-group-prepend"><span class="input-group-text">email</span></div>
				<input type="text" class="form-control" name="member_email" id="member_email" value="html5@gmail.com" required placeholder="이메일입력...."/>
			</div>
			<div class="form-group mt-md-5">
				<input type="reset" class="btn btn-success float-right login-btn ml-sm-2" value="새로고침"/>
				<input type="submit" class="btn btn-success float-right login-btn" value="글등록"/>
			</div>
		</form>
	</div>
</body>
</html>