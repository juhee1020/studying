<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--
	★★★★ request 아주 중요합니다~~ ★★★★

	request 기본객체(HttpServletRequest)
	
	request 기본객체는 jsp 페이지에서 가장 많이 사용되는 객체로서 웹브라우저의 요청과 관련있는 객체이다.
	웹브라우저에서 웹사이트주소를 입력하면 웹브라우저는 해당주소의 웹서버에 연결한 후 요청정보를 전송하는데
	이 요청 정보를 웹서버에 전달하는 객체가 request 객체이다.
	
	A. request 객체가 제공하는 기능

		a. 클라이언트(웹브라우저)와 관련된 정보
		b. 서버와 관련된 정보
		c. 클라이언트가 전송한 요청 파라미터 (http://localhost:8080?id=honh&pw=12345)
		d. 클라이언트가 전송한 요청헤더정보 (예 : http통신규약에 따른 정보)
		e. 클라이언트가 전송한 쿠키정보
		f. 속성처리정보 (프로퍼티이다?)



	B. request 객체의 메서드

		a. getRemoteAddr()       : 웹서버에 연결한 클라이언트의 IP주소
		b. getContentLength()    : 클라이언트가 요청한 정보의 총 길이
		c. getCharterEncording() : 클라이언트가 요청정보를 전송할 때 사용한 문자셋 정보
		d. getContentType()      : 클라이언트가 요청정보를 전송할 때 사용한 컨텐트(문서)타입 정보
		e. getProtocol()         : 클라이언트가 요청한 프로토콜(http, https, ftp...)
		f. getMethod()           : 웹브라우저가 정보를 전송할 때의 방식(get, post...)
		g. getRequestURI()       : 웹브라우저가 요청한 URL 정보
		h. getContextPath()      : JSP페이지가 소속된 웹애플리케이션의 ContextPath정보
		i. getServerName()       : 연결할 때 사용한 웹서버의 이름 (톰캣서번지 아파치 서번지 등...)
		j. getServerPort()       : 연결할 때 사용한 웹서버의 포트정보



	C. request 객체의 요청파라미터 관련 메서드

		a. getParameter(String name)       : name인 파라미터의 값을 리턴, 없을 경우 null 리턴
		b. getParameterValues(String name) : name인 파라미터의 값을 배열로 리턴, 없을 경우 null
		c. getParameterNames()             : 웹브라우저가 전송한 파라미터의 이름 목록을 리턴
		d. getParameterMap()               : 웹브라우저가 전송한 파라미터를 Map타입으로 리턴



	D. request 객체의 요청헤더 정관련 메서드

		a. getHeader(String name)      : 지정한 name의 헤더값을 리턴
		b. getHeaders(String name)     : 지정한 name의 헤더목록을 리턴
		c. getGeaderNames(String name) : 모든 헤어이름을 리턴
		d. getIntHeader(String name)   : 지정한 헤더의 값을 정수값으로 리턴 // 헤더값은 보통 스트링으로 되있으므로 매개변수(파라미터)는(?) String이다.
		e. getDateHeader(String name)  : 지정한 헤더의 값을 시간값으로 리턴 


-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  https://search.naver.com/search.naver?ie=UTF-8&query=%EC%BD%94%EB%A1%9C%EB%82%98&sm=chr_hty  -->
<!-- ? 뒤 : 리퀘스트 요청된 파라미터들...? -->
	<!--<form action="" method="post"></form> -->
	<h1>request 객체의 메서드</h1>
	<h3>a. 클라이언트의 ip 주소    : <%= request.getRemoteAddr() %></h3> <!-- 리퀘스트는 기본객체라 내가 어디 정의하지않아도 걍 쓸 수 있음 -->
	<h3>b. 요청정보의 길이         : <%= request.getContentLength() %></h3>
	<h3>c. 요청정보의 인코딩       : <%= request.getCharacterEncoding() %></h3>
	<h3>d. 요청정보의 컨텐츠타입   : <%= request.getContentType() %></h3>
	<h3>e. 요청정보의 프로토콜     : <%= request.getProtocol() %></h3>
	<h3>f. 요청정보의 전송방식     : <%= request.getMethod() %></h3>
	<h3>g. 요청정보의 URI          : <%= request.getRequestURI() %></h3>
	<h3>h. 요청정보의 컨텍스트경로 : <%= request.getContextPath() %></h3>
	<h3>i. 요청정보의 서버이름     : <%= request.getServerName() %></h3>
	<h3>j. 요청정보의 서버프로토콜 : <%= request.getServerPort() %></h3>
</body>
</html>