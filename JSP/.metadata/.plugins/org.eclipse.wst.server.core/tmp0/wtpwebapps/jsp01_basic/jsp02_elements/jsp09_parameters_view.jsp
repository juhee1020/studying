<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>요청된 파라미터의 정보 조회</h1>
	<div>get 방식 : http://localhost:8080/jsp01_basic/jsp02_elements/jsp09_parameters_view.jsp?name=%EC%84%9C%EC%9A%B8+%EC%84%9C%EC%B4%88%EA%B5%AC+%EC%9D%B4%EC%A0%A0...&pw=12345&addr=%ED%99%8D%EA%B8%B8%EB%8F%99&hobby=%EB%8F%85%EC%84%9C&hobby=%EC%9A%B4%EB%8F%99&hobby=%EC%9D%8C%EC%95%85</div>
	<div>get방식은 주소창에 쪼로록 다 나오고</div><br />
	<div>post 방식 : http://localhost:8080/jsp01_basic/jsp02_elements/jsp09_parameters_view.jsp</div>
	<div>post 방식은 숨겨지는거인듯</div>
	<br /><br />

	<h3>a. getParameter(String name)</h3>
	<div>name 파라미터 : <%= request.getParameter("name") %></div>
	<div>pw 파라미터 : <%= request.getParameter("pw") %></div>
	<div>addr 파라미터 : <%= request.getParameter("addr") %></div>
	<div>hobby 파라미터 : <%= request.getParameter("hobby") %></div>
	<br /><br /><br />
<%
		String[] hobbies=request.getParameterValues("hobby");
		if(hobbies!=null){
			for(String hobby:hobbies){ %>
				취미 : <%= hobby %><br> <!-- 여기는 html 코드라서 < % %> 밖에 써주는것.  -->
<%			}
		}
	%>

<!-- 08 실행해서 전송해서 보면 
a. getParameter(String name)
name 파라미터 : ìì¸ ìì´êµ¬ ì´ì  ...
pw 파라미터 : 12345
addr 파라미터 : íê¸¸ë
hobby 파라미터 : [Ljava.lang.String;@5a9627c2

요렇게 전송된 값들이 깨져있다.
set메서드를 써준다...?
	>> < % request.setCharacterEncoding("UTF-8"); % >

톰캣에서 get/set방식으로 전달되는 파라미터의 값을 읽어 올 때 사용하는 문자셋은 기본적으로 UTF-8로 전달된다.
그렇기 때문에 TOMCAT에서는 별도로 문자셋을 설정하지않아도 UTF-8문자셋을 사용한다. 
하지만 UTF-8이 아닌 문자셋을 파라미터로 전달하는 경우에는 server.xml의 <connector>태그의
useBodyEncodingForURI="true"를 추가하면 된다.

true로 설정할 경우에는 get방식으로 전달되는 파라미터값을 읽을때 
request 객체의 setCharacterEncoding("UTF-8")메서드를 호출해서 지정된 문자셋을 사용할 수 있게된다.
-->



	<h3>a. getParameterMap</h3>
	<div>map.get("name")</div>
<%
		Map<String, String[]> map1=request.getParameterMap();
		String[] values1=map1.get("name"); // 속성명?을 가져온다.
		if(values1!=null){
			for(int i=0; i<values1.length ;i++){ %>
				요청파라미터(name)의 값 : <%= values1[i] %>
<%			}
		}
	%>
	<div>map.get("hobby");</div>
<%
		Map<String, String[]> map2=request.getParameterMap();
		String[] values2=map2.get("hobby"); // 속성명?을 가져온다.
		if(values2!=null){
			for(int i=0; i<values2.length ;i++){ %>
				요청파라미터(name)의 값 : <%= values2[i] %>
<%			}
		}
	%>
</body>
</html>