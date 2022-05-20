<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table, td {
		border: 1px solid black;
		border-collapse: collapse;
		padding: 7px;
	}
</style>
</head>
<body>
	<h1> 게시판 목록 </h1>
	<a href="boardInsert.do"> 게시글 작성하기 </a>
	<hr>
	<table>
		<tr>
			<td>번호</td>
			<td>내용</td>
			<td>내용</td>
			<td>작성자</td>
			<td>게시일</td>
			<td>수정일</td>
		</tr>
		<c:forEach items="${boardlist }" var="board">
			<tr>
				<td><a href="board.do?boardid=${board.bno}">${board.bno} </a></td>
				<td>${board.title}</td>
				<td>${board.content}</td>
				<td>${board.writer}</td>
				<td>${board.regDate}</td>
				<td>${board.updateDate}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>