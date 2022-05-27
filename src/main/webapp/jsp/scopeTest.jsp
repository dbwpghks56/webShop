<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>scopeTest.jsp 페이지...Servlet Scope를 test한다.</h1>
    <p>applecation 영역의 접근 : <%=application.getAttribute("appVar") %></p>
    <p>session 영역의 접근 : <%=session.getAttribute("sessionVar") %></p>
    <p>request 영역의 접근 : <%=request.getAttribute("requestVar") %></p>
    <hr>
    <h2>EL(Expression language) 문법</h2>
    <h2>scope 순서 request > session > application</h2>
    <p>${appVar}</p>
    <p>${sessionVar}</p>
    <p>${requestVar}</p>
    <p>${myphone }</p>
</body>
</html>