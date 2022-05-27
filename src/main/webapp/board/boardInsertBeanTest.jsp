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
	<h1>게시글 작성하기</h1>
	<form action="boardInsertBeanTest2.jsp" method="post">
		제목 : <input type="text" name="title" value=""> <br>
		내용 : <input type="text" name="content" value=""> <br>
		작성자 : <input type="text" name="writer" value="" > <br>
		<input type="submit" value="등록하기">
		<input type="reset" value="취소하기">
	</form>
</body>
</html>