<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인하기</h1>
	<jsp:include page="../common/header.jsp"></jsp:include>
	<form action="login.do" method="post">
		사용자번호 : <input type="text" name="userid" value="wpghks56">
		비밀번호 : <input type="text" name="userpass" value="1234">
		<input type="hidden" name="user_email" value="@naer.com">
		<input type="hidden" name="user_address" value="seoul">
		<input type="submit" value="login">
	</form>
</body>
</html>