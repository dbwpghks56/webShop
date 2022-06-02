<%@page import="dto.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	BoardDto board = new BoardDto(0, "title", "content", "writer", null, null);
    	application.setAttribute("boardVO", board);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL 연습</title>
</head>
<body>
	<h1>EL 연습</h1>
	<pre>
	1. EL 읽기 ${boardVO}
	
	
	
	</pre>
	<%-- <jsp:forward page="elTest4.jsp"></jsp:forward> --%>
	<jsp:include page="elTest4.jsp"></jsp:include>
</body>
</html>