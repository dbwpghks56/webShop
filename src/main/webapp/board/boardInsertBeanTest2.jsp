<%@page import="dto.BoardDto"%>
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
	<h1>Java Bean Test</h1>
	<%
		// 1. 자바 코드로 파라메터 받아서 객체 생성
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String writer = request.getParameter("writer");
		
		BoardDto board = new BoardDto();
		board.setTitle(title);
		board.setContent(content);
		board.setWriter(writer);
	%>
	제목 : <%= board.getTitle() %> <br>
	내용 : <%= board.getContent() %> <br>
	작성자 : <%= board.getWriter() %> <br>
	<hr>
	<h2>2. Action Tag 사용하기 : jsp:useBean 이용</h2>
	<jsp:useBean id="board2" class="dto.BoardDto" scope="session"></jsp:useBean>
	<%-- <jsp:setProperty property="title" name="board2" value="${param.title }"/>
	<jsp:setProperty property="content" name="board2" value="${param.content }"/>
	<jsp:setProperty property="writer" name="board2" value="${param.writer }"/> --%>
	<jsp:setProperty property="title" name="board2" param="title"/>
	<jsp:setProperty property="content" name="board2" param="content"/>
	<jsp:setProperty property="writer" name="board2" param="writer"/>
	
	<jsp:setProperty property="*" name="board2"/>
	<hr>
	<h2>Action Tag 사용해서 읽기</h2>
	제목 : <jsp:getProperty property="title" name="board2"/> <br>
	내용 : <jsp:getProperty property="content" name="board2"/> <br>
	작성자 : <jsp:getProperty property="writer" name="board2"/>
</body>
</html>












