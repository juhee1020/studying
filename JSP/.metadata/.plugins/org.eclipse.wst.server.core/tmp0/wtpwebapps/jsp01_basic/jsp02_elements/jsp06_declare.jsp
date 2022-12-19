<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!
// 메서드 선언
	int a=0; int b=0; int result1, result2, result3; double result4;
	public int add(int a, int b){
		return a+b;}
	public int sub(int a, int b){
		return a-b;}
	public int mul(int a, int b){
		return a*b;}
	public double div(double a, double b){
		return a/b;
	}
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 실습1. add(), sub(), mul(), div() 메서드 생성 후 각 결과 출력 -->
<% 
a=50; b=60; 
result1=add(a,b);
result2=sub(a,b);
result3=mul(a,b);
result4=div(a,b);
%>
<div>50+60=<%= result1 %> </div>
<div>50-60=<%= result2 %> </div>
<div>50*60=<%= result3 %> </div>
<div>50/60=<%= result4 %> </div>
</body>
</html>