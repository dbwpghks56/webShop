<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	h1 {
		background-color: skyblue;
	}
</style>
</head>
<body>
	<form action="boardUpdate.do" method="post">
		<h1>파라미터로 받은 보드번호 : ${param.boardid}</h1>
		<input type="hidden" name="bno" value="${board.bno}">
		제목 : <input type="text" name="title" value="${board.title }"> <br>
		내용 : <input type="text" name="content" value="${board.content }"> <br>
		작성자 : <input type="text" value="${board.writer }" readonly="readonly"> <br>
		게시일 : <input type="text" value="${board.regDate }" readonly="readonly"> <br>
		수정일 : <input type="text" value="${board.updateDate }" readonly="readonly"> <br>
		<input type="submit" value="수정하기">
		<input type="reset" value="취소하기">
	</form>
</body>
</html>