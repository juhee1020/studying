<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--
	2. pageContext 기본객체
		1) jsp 파일 하나당 한개씩 존재하는 기본객체
			a. 기본객체구하기
			b. 속성처리하기
			c. 페이지흐름 제어하기
			d. 에러데이터 구하기

		2) 관련 메서드 // 모두객체를 가져온다... (?)
			a. getRequest()        : request 객체를 구하기
			b. getResponse()       : response객체를 구하기
			c. getSession()        : 현재 session객체를 구하기
			d. getServletContext() : application객체를 구하기
			e. getServletConfig()  : config객체를 구하기
			f. getOut()            : out객체 구하기
			g. getPage()           : page객체 구하기
			h. getException()      : exception 객체 구하기
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5><%= request.toString() %> = <%= pageContext.getRequest() %></h5>
	<h5><%= response.toString() %> = <%= pageContext.getResponse() %></h5>
	<h5><%= session %> = <%= pageContext.getSession() %></h5>
	<h5><%= application %> = <%= pageContext.getServletContext() %></h5>
	
	<% 
		HttpServletRequest req = (HttpServletRequest)pageContext.getRequest();
	%>
	
	pageContext.getRequest() 메서드로 가져온 request객체의 정보 : 
	<%= req.getRemoteAddr() %><br>
	pageContext.getRequest()메서드로 가져온 request 객체의 정보 : 
	<%= request.getRemoteAddr() %>
	<hr>
	<h5><%= req==request %></h5>
	<hr>
	
	<% out.print("<h3>out기본객체에서 직접출력하기!!!</h3>"); %>
	<% pageContext.getOut().print("<h3>pageContext에서 가져온 out기본객체에서 출력하기</h3>"); %>
	<h3><%= out ==  pageContext.getOut()%></h3>
	<hr>
	<h1>로그메시지 기록하기</h1>
	<%
		application.log("application객체 : 로그메시지 기록하기...");
		log("jsp페이지가 제공하는 log()메서드 : jsp페이지의 log메서드의 로그메시지 기록하기!!");
	%>
</body>
</html>