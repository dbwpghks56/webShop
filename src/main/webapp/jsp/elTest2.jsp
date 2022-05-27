<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	application.setAttribute("myName", "A");
    	pageContext.setAttribute("myName", "B");
    	request.setAttribute("myName", "C");
    	session.setAttribute("myName", "D");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>EL(Expression Language)</h1>
	1. 저장영역에서 읽기 : ${user.getEmail() } <br>
	2. 저장영역에서 읽기 : ${applicationScope.myName } <br>
	2. 저장영역에서 읽기 : ${requestScope.myName } <br>
	2. 저장영역에서 읽기 : ${sessionScope.myName } <br>
	2. 저장영역에서 읽기 : ${pageScope.myName } <br>
	3. param : ${param.myName } <br>
	3. param : ${paramValues.subject[0] } <br>
	3. param : ${paramValues.subject[1] } <br>
	4. pageContext : 내장 객체 이용시 이용 : ${pageContext.request.contextPath} <br>
	5. 로그인한 사용자 정보 : ${user.userName } <br>
</body>
</html>