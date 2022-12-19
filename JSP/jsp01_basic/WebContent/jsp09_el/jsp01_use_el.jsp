<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 
	기본객체 : request, response, session, application, out
	
	영역 : page, request, session, application
	
	EL영역 : pageScope, requestScope, sessionScope, applicationScope

 -->
 <%request.setAttribute("name", "메이플");%>
 <h3>표현식</h3>
 이름 :  <%= request.getAttribute("name") %><br><br>
 이름 : ${request.getAttribute("name")} - 값을 가져오지못함.<br>
 EL안({})에는 request객체 대신에 requestScope를 사용한다.<br>
 request의 addr 속성의 값 = <%= request.getParameter("addr") %>
 <br><br><br>
 
 
 
 <h3>표현언어(EL)</h3>
 이름 : ${requestScope.name}<br>
 request의 addr 속성의 값 : ${param.addr}<br>
 ${pageContext.request.requestURI}
 <br><br><br>
 <!--
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
-->