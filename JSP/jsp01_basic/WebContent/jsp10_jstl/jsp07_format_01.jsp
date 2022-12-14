<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="KO"></fmt:setLocale>
<fmt:bundle basename="resource.message">
	<fmt:message key="TITLE" var="title"/>
</fmt:bundle>


<!-- 다국어 페이지로 할때 번들페이지를 줘서~~ -->


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${title}</title>
</head>
<body>

	<!-- 한글을 유니코드로 변경하기
	native2ascil.exe message_ko.properties -->

	<h1>${title}</h1>
	<fmt:bundle basename="resource.message">
		<fmt:message key="GREETING"/>
		<c:if test="${!empty param.id}">
			<fmt:message key="VISITOR">
				<fmt:param value="${param.id}"></fmt:param>
				<!-- http://localhost:8080/jsp01_basic/jsp10_jstl/jsp07_format_01.jsp?id=maple -->
				<!-- 라고 치면 안녕하세요? JSP/Servlet 당신의 ID는 maple 입니다.라고 뜬다. -->
			</fmt:message>
		</c:if>
	</fmt:bundle>
</body>
</html>