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
         <h3>게시글 상세보기</h3>
      </div>
      <br>
		<div>조회수 : ${board.getSeq()}</div><hr>
		<div>제목 : ${board.getTitle()}</div><hr>
		<div>작성자 : ${board.getWriter()}</div><hr>
		<div>내용 : ${board.getContent()}</div><hr>
		<div>작성일 : ${board.getRegdate()}</div><hr>
		<div>조회수 : ${board.getCnt()}</div><hr>
		<button type="button" class="btn btn-danger"><a href="deleteBoard.do?seq=${board.getSeq()}" style="color:white;">삭제</a></button>
		<button type="button" class="btn btn-warning"><a href="updateBoard.do?seq=${board.getSeq()}" style="color:white;">수정</a></button>
		<button type="button" class="btn btn-secondary"><a href="boardList.do" style="color:white;">게시판목록</a></button>
   </div>
</body>
</html>