<%@page import="com.lec.web.model.Message"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.lec.web.jdbc.ConnectionProvider"%>
<%@page import="com.lec.web.dao.MessageDAO"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	// 주소창에서 update_form.jsp?id=1000&cp=1 >> id랑 currentPage가 값으로 들어온다.
	int id = Integer.parseInt(request.getParameter("id"));
	int cp = Integer.parseInt(request.getParameter("cp"));
	Connection conn = ConnectionProvider.getConnection();
	MessageDAO messageDAO = MessageDAO.getInstance();
	Message view_data = messageDAO.select(conn, id);
%>
<c:set var="view_data" value="<%=view_data%>"></c:set>
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
</head>
<body>
	<div class="container" align="center">
	
		<h3>삭제하기(페이지번호 : <%= cp %>)</h3>
		
		<form action="delete_message.jsp" method="post">
		
			<div class="input-group mb-2 mr-sm-2">
				<div class="input-group-prepend">
					<span class="input-group-text"><i class="fas fa-user"></i></span>
				</div>
				<input type="text" class="form-control" name="guestName" value="${ view_data.guestName }" disabled/>
			</div>
			
			<div class="input-group mb-2 mr-sm-2">
				<div class="input-group-prepend">
					<span class="input-group-text"><i class="fas fa-lock"></i></span>
				</div>
				<input type="password" class="form-control" name="pw"/>
			</div>
			
			<div class="input-group mb-2 mr-sm-2">
				<div class="input-group-prepend">
					<span class="input-group-text"><i class="fas fa-comment-dots"></i></span>
				</div>
				<textarea name="msg" id="" cols="30" rows="10" class="form-control" disabled>${ view_data.message }</textarea>
			</div>
			<input type="hidden" name="id" value="${ param.id }"/>
			<input type="hidden" name="cp" value="${ param.cp }"/>
			<input type="submit" class="btn btn-danger mb-2" value="삭제"/>	
			<!--  update_message.jsp?id=1002&cp=1 -->		
		</form>
	</div>
</body>
</html>