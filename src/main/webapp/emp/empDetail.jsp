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
	<h1>파라미터로 받은 부서번호 : ${param.empid}</h1>
	<p> First_name : ${emp.first_name } </p>
	<p> Last_name : ${emp.last_name } </p>
	<p> Email : ${emp.email } </p>
	<p> Phone : ${emp.phone_number } </p>
	<p> Salary : ${emp.salary } </p>
	<p> 입사일 : ${emp.hire_date } </p>
</body>
</html>