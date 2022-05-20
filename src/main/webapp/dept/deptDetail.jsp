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
	<h1>파라미터로 받은 부서번호 : ${param.dept_id}</h1>
	<p> 부서이름 : ${deptname}</p>
	<p>매니져 : ${mid }</p>
	<p>location_id : ${loc }</p>
	<p> ${dept } </p>
	<p> ${dept.department_id } </p>
	<p> ${dept.department_name } </p>
	<p> ${dept.manager_id } </p>
	<p> ${dept.location_id } </p>
</body>
</html>