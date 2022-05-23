<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
	h1 {
		background-color: skyblue;
	}
	input, label {
		margin-left: 10px;
	}
</style>
</head>
<body>
	<form action="empDetail.do" method="post">
		직원 번호 : ${param.empid} <br>
		<input type="hidden" name="empno" value=${emp.employee_id }><br>
		<div class="form-group">
			<label for="">first_name<input type="text" class="form-control" name="first_name" value=${emp.first_name }></label>
		</div>
		<div class="form-group">
			<label for="">last_name<input type="text" class="form-control"  name="last_name" value=${emp.last_name }></label>
		</div>
		<div class="form-group">
			<label for="">email<input type="text" class="form-control"  name="email" value=${emp.email }></label>
		</div>
		<div class="form-group">
			<label for="">phone<input type="text" class="form-control"  name="phone" value=${emp.phone_number }></label>
		</div>
		<div class="form-group">
			<label for="">salary<input type="number"  class="form-control" name="salary" value=${emp.salary }></label>
		</div>
		<div class="form-group">
			<label for="">hire<input type="text" class="form-control"  name="hire" value=${emp.hire_date }></label>
		</div>
		<input type="submit" class="btn btn-primary" value="수정하기"> <input type="reset" class="btn btn-secondary" value="취소">
	</form>
</body>
</html>