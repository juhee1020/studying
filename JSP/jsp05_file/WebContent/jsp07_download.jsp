<%@page import="java.net.URLEncoder"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("utf-8");
	String fileName=request.getParameter("f");
	
	String fromPath="C:/Users/ezen/Desktop/04 jsp/99.temp/upload/"+fileName;
	String toPath="C:/Users/ezen/Desktop/04 jsp/99.temp/download/"+fileName;
	// 크롬의 경우엔 걍 보통 다운로드 폴더에 저장되는듯. - 크롬이 강제하는듯.
	
	byte[] b = new byte[4096];
	File f = new File(toPath);
	FileInputStream fis = new FileInputStream(fromPath);
	
	String sMimeType = getServletContext().getMimeType(fromPath); // mimetype = file type : pdf, exe, txt.... 
	if(sMimeType == null) sMimeType = "application/octet-stream";
	
	String sEncoding = new String(fileName.getBytes("utf-8"), "8859_1");
	String sEncoding1 = URLEncoder.encode(fileName, "utf-8");
	
	response.setContentType(sMimeType);
	response.setHeader("Content-Transfer-Encoding", "binary");
	response.setHeader("Content-Transfer-Disposition", "attachment; filename=");
	
	ServletOutputStream os = response.getOutputStream();
	int numRead;
	
	while((numRead=fis.read(b, 0, b.length)) != -1 ) {
		os.write(b, 0, numRead);
	}
	
	os.flush();
	os.close();
	fis.close();
%>
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
	<h3>파일다운로드성공!!</h3>
</body>
</html>