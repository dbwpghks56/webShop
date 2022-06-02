<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL 연습</h1>
	<pre>
	1. set (setAttribute) : var는 변수이름, value는 값, scope는 기본이 page
	<c:set var="myName" value="Jea" scope="page"></c:set>
	<!-- pageContext.setAttribute("myName", "Jea")와 같다. ${pageContext.request.contextPath} -->
	2. get (getAttribute) : ${myName}
	</pre>
	<c:forEach begin="1" end="5" step="1" var="num">
		${num } <br>
	</c:forEach>
	<%
		String[] arr = {"df", "adf", "er", "as"};
		request.setAttribute("week", arr);
	%>
	<c:forEach items="${week }" var="day" varStatus="status">
		${status.index}/${status.count }/${status.first }/${status.last }...${day } <br>
	</c:forEach>
	
	4.토큰
	<c:set var="subject" value="자바,sql,jsp/servlet,Spring"></c:set>
	<c:forTokens items="${subject }" delims="," var="ss">
		<p>${ss }</p>
	</c:forTokens>
</body>
</html>