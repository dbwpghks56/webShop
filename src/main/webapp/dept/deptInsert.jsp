<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="deptInsert.do" method="post">
            부서번호 : <input type="number" name="department_id"><br>
            부서이름 : <input type="text" name="department_name"><br>
            매니져 번호 : <input type="number" name="manager_id" value="100"><br>
            지역번호 : <input type="number" name="location_id" value="1700"><br>
            <input type="submit" value="부서 등록">
            <input type="reset" value="취소하기">
    </form>
</body>
</html>