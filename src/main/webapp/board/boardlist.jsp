<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
<style>
	table, td {
		border: 1px solid black;
		border-collapse: collapse;
		padding: 7px;
	}
	.color1 {
		background-color: beige;
	}
	.color2 {
		background-color: pink;
	}
</style>
<script type="text/javascript">
	$(() => {
		$(".deptDetailView").click(function() {
			let bno_data = $(this).attr("data-bno");
			$.ajax({
				type: "post",
				async: false,
				url : "board2.do",
				data: {boardid : bno_data},
				success: (data) => {
					let obj = JSON.parse(data);
					$("#board_id").val(obj["board_id"]);
					$("#board_title").val(obj["board_title"]);
					$("#board_content").val(obj["board_content"]);
					$("#board_writer").val(obj["board_writer"]);
				},
			});
		});
	});
	
</script>
</head>
<body>
	<h1> 게시판 목록 </h1>
	<a href="boardInsert.do"> 게시글 작성하기 </a>
	${pageContext.request.contextPath}
	<%-- <%@ include file="../common/header.jsp" %> --%> <!-- 공통 코드는 이런 식으로 추가할 수 있다. 합치고 컴파일 -->
	<%-- <jsp:include page="../common/header.jsp"></jsp:include> --%><!-- 컴파일하고 합치기 -->
	
	<hr>
	<table>
		<tr>
			<td>순서</td>
			<td>상세보기</td>
			<td>번호</td>
			<td>내용</td>
			<td>내용</td>
			<td>작성자</td>
			<td>게시일</td>
			<td>수정일</td>
		</tr>
		<c:forEach items="${boardlist }" var="board" varStatus="status">
			<c:if test="${status.count % 2 ==0 }">
				<tr class="color2">
			</c:if>
			<c:if test="${status.count % 2 !=0 }">
				<tr class="color1">
			</c:if>
				<td>${status.count }</td>
				<td><input type="button" class="deptDetailView btn btn-primary" value="상세보기" data-toggle="modal" data-target="#myModal" data-bno="${board.bno}"></td>
				<td><a href="board.do?boardid=${board.bno}">${board.bno} </a></td>
				<td>${board.title}</td>
				<td>${board.content}</td>
				<td>${board.writer}</td>
				<td>${board.regDate}</td>
				<td>${board.updateDate}</td>
			</tr>
		</c:forEach>
	</table>
	<div class="modal" id="myModal">
    <div class="modal-dialog">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">게시판 상세보기</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
        	게시물 번호 : <input type="text" id="board_id"> <br>
        	제목 : <input type="text" id="board_title"> <br>
        	내용 : <input type="text" id="board_content"> <br>
        	작성자 : <input type="text" id="board_writer"> <br>
        </div>
        
        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
        </div>
        
      </div>
    </div>
  </div>
</body>
</html>


