<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
   <title>Spring Framework</title>
   <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">   
   <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" 
      integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" 
      crossorigin="anonymous">
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>   
</head>
<body>
   <div class="container" align="center">
      <div class="mt-4 p-5 bg-primary text-white rounded">
         <h3>게시글 작성하기</h3>
      </div>
      <br>
      <div class="container" align="center">
	
		<div class="jumbotron">
			<h3>게시판글쓰기</h3>
			<p>게시판글쓰기 페이지 입니다. 클을 작성해 주세요!!</p>
		</div>
	
		<form action="boardWrite.bo?p=${p}&f=${f}&q=${q}" method="post" class="form-group" 
			name="boardform" enctype="multipart/form-data">
			
			<div class="form-group input-group">
				<div class="input-group-prepend"><span class="input-group-text"><i class="fas fa-user"></i></span></div>
				<input type="text" class="form-control" name="board_name" id="board_name" value="홍길동" required
				placeholder="작성자이름을 입력하세요...."/>
			</div>
			
			<div class="form-group input-group">
				<div class="input-group-prepend"><span class="input-group-text"><i class="fas fa-key"></i></span></div>
				<input type="password" class="form-control" name="board_pass" id="board_pass" value="12345" required
				placeholder="비밀번호를 입력하세요...."/>
			</div>
			
			<div class="form-group input-group">
				<div class="input-group-prepend"><span class="input-group-text"><i class="fas fa-clipboard"></i></span></div>
				<input type="text" class="form-control" name="board_subject" id="board_subject" value="<%= new java.util.Date() %>" required
				placeholder="제목을 입력하세요...."/>
			</div>
			
			<div class="form-group input-group">
				<div class="input-group-prepend"><span class="input-group-text"><i class="fas fa-comment-dots"></i></span></div>
				<textarea class="form-control" name="board_content" id="board_content" cols="40" rows="15" required
				placeholder="글내용을 입력하세요....">글 내용...</textarea>
			</div>
			
			<div class="form-group input-group">
				<div class="input-group-prepend"><span class="input-group-text"><i class="fas fa-file-alt"></i></span></div>
				<div class="custom-file">
					<input type="file" class="custom-file-input" name="board_file" id="board_file"/>
					<label for="board_file" class="custom-file-label" style="text-align: left">업로드할 파일을 선택하세요!!</label>
				</div>
			</div>
			
			<div class="form-group mt-md-5">
				<input type="reset" class="btn btn-success float-right login-btn ml-sm-2" value="새로고침"/>
				<input type="submit" class="btn btn-success float-right login-btn" value="글등록"/>
			</div>
		</form>
	</div>
   </div>
</body>
</html>