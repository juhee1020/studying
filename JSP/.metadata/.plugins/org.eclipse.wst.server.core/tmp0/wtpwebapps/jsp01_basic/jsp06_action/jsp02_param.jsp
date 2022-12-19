<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<h1></h1>
	<% 
		String sts=request.getParameter("status");
		if(sts.equals("A")){
			out.print("<h3 class='text-primary'>"+sts+" 등급 제품</h3>");
		}else if(sts.equals("B")){
			out.print("<h3 class='text-primary'>"+sts+" 등급 제품</h3>");
		}
	%>