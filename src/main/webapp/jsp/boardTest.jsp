<%@page import="dto.BoardDto"%>
<%@page import="java.util.List"%>
<%@page import="model.BoardService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <%
    	BoardService service = new BoardService();
    	List<BoardDto> blist = service.selectAll();
    	request.setAttribute("blist", blist);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${blist}" var="board">
	<p>${board.title }</p>
</c:forEach>
</body>
</html>