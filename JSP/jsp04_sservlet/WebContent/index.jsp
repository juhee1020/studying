<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--< %@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>-->
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
		<h1>로그인</h1>
		<<form action="login" metod="post" class="form-group">
			<input type="text" name="id" value="root" class="mb-sm-2"/><hr>
			<input type="password" name="pw" value="12345" class="mb-sm-2"/><hr>
			<input type="checkbox" name="hobbies" value="cook">요리
			<input type="checkbox" name="hobbies" value="sport">운동
			<input type="checkbox" name="hobbies" value="music">음악
			<input type="checkbox" name="hobbies" value="reading">독서 <br>
			<input type="radio" name="majors" value="kor" />국어
			<input type="radio" name="majors" value="eng" />영어
			<input type="radio" name="majors" value="math" />수학
			<input type="radio" name="majors" value="sci" />과학
			
			<select name="protocol" id="" class="mb-sm-2">
				<option value="http">HTTP</option>
				<option value="ftp" selected="selected">FTP</option>
				<option value="smtp">SMTP</option>
				<option value="pop">POP</option><br>
			<input type="submit" class="btn btn-primary" value="로그인"/>
			</select>
		</form>
	</div>
</body>
</html>