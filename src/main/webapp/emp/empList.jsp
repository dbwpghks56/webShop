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
	<h1>직원 목록 </h1>
		<table>
			<tr>
				<td>직원 번호</td>
				<td>성</td>
				<td>이름</td>
				<td>입사일</td>
				<td>급여</td>
				<td>전화번호</td>
				<td>커미션</td>
				<td>메니져</td>
				<td>직책</td>
				<td>이메일</td>
			<c:forEach items="${emplist}" var="emp">
				<tr>
					<td><a href="empDetail.do?empid=${emp.employee_id}">${emp.employee_id} </a></td>
					<td>${emp.first_name}</td>
					<td>${emp.last_name}</td>
					<td>${emp.hire_date}</td>
					<td>${emp.salary}</td>
					<td>${emp.phone_number}</td>
					<td>${emp.commission_pct}</td>
					<td>${emp.manager_id}</td>
					<td>${emp.job_id}</td>
					<td>${emp.email}</td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>