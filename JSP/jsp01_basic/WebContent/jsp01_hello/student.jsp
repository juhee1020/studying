<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>

<%
class Student{
	int sno; String name; String gender; int age;
	
	public Student(int sno, String name, String gender, int age){
		this.sno=sno; this.name=name; this.gender=gender; this.age=age;
	}
}

Student std=new Student(1000, "오마코","남자",43);

List<Student> studnets=new ArrayList();
studnets.add(new Student(2000, "소향","여자",44));
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	실습1.(변수) 학생1명의 정보를 출력하기.
	학생 번호 : 1000 / 이름 : 오마코 / 성별 : 남자 / 나이 : 43
	
	실습2. ArrayList를 이용해서 학생1명만 출력
	학생 번호 : 2000->인덱스0 / 소향->인덱스1 / 여자->인덱스2 / 44->인덱스3
-->
<h3>학생1 번호 : <%= std.sno %>  </h3>
<h3>학생1 이름 : <%= std.name %>  </h3>
<h3>학생1 성별 : <%= std.gender %>  </h3>
<h3>학생1 나이 : <%= std.age %>  </h3>
<hr>
<h3>학생2 번호 : <%= studnets.get(0).sno %>  </h3>
<h3>학생2 이름 : <%= studnets.get(0).name %>  </h3>
<h3>학생2 성별 : <%= studnets.get(0).gender %>  </h3>
<h3>학생2 나이 : <%= studnets.get(0).age %>  </h3>

</body>
</html>