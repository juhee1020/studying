<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% int sum=0;
for(int i=0; i<=10; i++){
	sum+=i;}
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 실습. 1부터 10까지의 합. -->
<!-- 표현식 이용. -->
<div>1~10까지 합 : <%= 1+2+3+4+5+6+7+8+9+10 %></div>
<div>1~10까지 합 : <%= sum %></div>
<!-- for문 사용. -->
</body>
</html>