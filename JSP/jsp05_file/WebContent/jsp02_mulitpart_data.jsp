<%@page import="java.io.InputStream" %>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page trimDirectiveWhitespaces="true" %>
<%-- <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<%
	InputStream is = null;

	out.print("[");
	out.println("request.getContentType");
	out.print("]");
	
	try {
		is = request.getInputStream();
		int data = -1;
		while((data=is.read()) != -1) {
			out.print((char)data);
		}
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		if(is!=null) try { is.close(); } catch(Exception e) {}
	}
%>
<!--
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

</body>
</html>
-->