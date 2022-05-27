<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>EL(Expression Language)</h1>
	1. 숫자 : ${100 } <br>
	2. 문자 : ${"문자" } <br>
	3. boolean : ${100>20 } <br>
	
	<form action="elTest2.jsp">
		myName : <input type="text" name="myName" value="AA">
		subject : <input type="checkbox" name="subject" value="컴공" checked="checked"> 컴공
		subject : <input type="checkbox" name="subject" value="경제" checked="checked"> 경제
		<input type="submit" value="가버렷">
	</form>
</body>
</html>