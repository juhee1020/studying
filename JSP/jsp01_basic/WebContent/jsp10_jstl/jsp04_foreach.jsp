<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	Map<String, String> member=new HashMap<>();
	member.put("id","maple1234");
	member.put("pw","12345");
	member.put("name","메이플");
	member.put("addr","판교 넥슨");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">	
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container" align="center">
		<h1>forEach</h1>
		<hr>
		<c:set var="data" value="<%= member %>"/>
		<h2>Collection(Map) 계열의 반복처리</h2>
		<c:forEach var="m" items="${data}">
			${m.key}=${m.value}<br>
		</c:forEach><hr>

		<h1>Array계열의 반복처리</h1>
		<c:set var="arrays" value="<%= new int[]{1,2,3,4,5,6,7,8,9} %>"/>
		<c:forEach var="i" items="${arrays}">
			${i}, 
		</c:forEach><hr>
		
		<h1>core tag를 이용한 반복처리</h1>
		<!--
		varStatus가 제공하는 속성 - count, step 정도가 이 중에선 많이 쓰인다는듯
			1. index : loop 실행에서 현재 인덱스
			2. count : loop 실행 횟수
			3. begin : begin 속성값
			4. end : end 속성값
			5. step : step 속성값
			6. first : 현재 실행이 첫번째 실행일 경우 true
			7. last : 현재 실행이 마지막 실행일 경우 true
			8. current : 컬랙션 중 현재 loop에서 사용할 객체
		-->
		<c:forEach var="i" items="${arrays}" begin="2" end="4" varStatus="status">
			${status.index} : ${status.count} = [ ${i} ] <br>
		</c:forEach><hr>

		<h3>실습1. 1부터 100까지 홀수의 합을 구하기 foreach에 비긴 엔드</h3>
		<c:set var="sum" value="0"/>
		<c:forEach var="i" begin="1" end="100" step="2">
			<c:set var="sum" value="${sum+i}"/>
		</c:forEach>
		<div>${sum}</div><hr>

		<h3>실습2. 구구단의 9단만 출력</h3>
		<ul>
			<c:forEach var="i" begin="1" end="9">
				<li>9 x ${i} = ${9*i}</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>