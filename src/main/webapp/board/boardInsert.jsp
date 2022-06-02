<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
	h1 {
		background-color: skyblue;
	}
</style>
</head>
<body>
	<h1>게시글 작성하기</h1>
	<form action="boardInsert.do" method="post" enctype="multipart/form-data">
		제목 : <input type="text" name="title" value=""> <br>
		내용 : <input type="text" name="content" value=""> <br>
		작성자 : <input type="text" name="writer" value="" > <br>
		<input type="file" name="photos">
		<input type="submit" value="등록하기">
		<input type="reset" value="취소하기">
		<input type="button" value="목록보기"id="boardlist">
	</form>
	<script type="text/javascript">
		$("#boardlist").click(()=>{
			location.href("boardlist.do");
		});
	</script>
</body>
</html>