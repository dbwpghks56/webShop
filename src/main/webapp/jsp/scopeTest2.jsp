<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>scopeTest2.jsp 페이지...Servlet Scope를 test한다.(Servlet과 연결하지 않음)</h1>
    <p>applecation 영역의 접근 : <%=application.getAttribute("appVar") %></p>
    <p>session 영역의 접근 : <%=session.getAttribute("sessionVar") %></p>
    <p>request 영역의 접근 : <%=request.getAttribute("requestVar") %></p>
    <hr>
    <h2>EL(Expression language) 문법</h2>
    <p>${appVar}</p>
    <p>${sessionVar}</p>
    <p>${requestVar}</p>
</body>
</html>