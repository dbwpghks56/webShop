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
	<h1>부서 목록 </h1>
	<a href="deptInsert.do">신규 부서</a>
		<table>
			<tr>
				<td>번호</td>
				<td>이름</td>
				<td>매니져 번호</td>
				<td>지역번호</td>
			<c:forEach items="${list }" var="dept">
				<tr>
					<td><a href="dept.do?dept_id=${dept.department_id}">${dept.department_id} </a></td>
					<td>${dept.department_name}</td>
					<td>${dept.manager_id}</td>
					<td>${dept.location_id}</td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>