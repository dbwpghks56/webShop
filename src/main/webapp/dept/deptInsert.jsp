<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<script type="text/javascript">
	$(() => {
		$("#duplicatebtn").click(() => {
			let empid = $("#department_id").val();
			if(empid == "" || empid == null) {
				alert("필수 입력입니다.")
				$("#department_id").focus();
			}
			else {
				$.ajax({
					url: "duplicateCheck.do",
					data: {"deptid":empid},
					type: "get",
					success: (responseData) => {
						// 중복 : 1, 안 중복 : 0
						$("#message").html(responseData == 1 ? "사용불가":"사용가능");
					},
					fail: () => {}
				});
			}
		});
	});
</script>
</head>
<body>
	<form action="deptInsert.do" method="post">
            부서번호 : <input type="number" name="department_id" id="department_id"> <input type="button" id="duplicatebtn" value="중복체크"> 
            <span id="message">!!!</span> <br>
            부서이름 : <input type="text" name="department_name"><br>
            매니져 번호 : <input type="number" name="manager_id" value="100"><br>
            지역번호 : <input type="number" name="location_id" value="1700"><br>
            <input type="submit" value="부서 등록">
            <input type="reset" value="취소하기">
    </form>
</body>
</html>