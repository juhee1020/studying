<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	요청처리과정에서 에러가 발생했습니다.
	빠른 시간 내에 해결하겠습니다.<br>
	
	에러타입 : <br><%= exception.getClass().getName() %><br><br>
	에러메세지 : <br><%= exception.getMessage() %><br><br>
	에러메시지 : <br><%= exception.getLocalizedMessage() %>
</body>
</html>