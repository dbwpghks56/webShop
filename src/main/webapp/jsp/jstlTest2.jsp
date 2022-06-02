<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL 연습</h1>
	1. url 만들기
	<c:set var="path" value="${pageContext.request.contextPath }"></c:set>
	<c:url var="newUrl" value="/jsp/jstlTest3.jsp">
		<c:param name="myName" value="Ryu"></c:param>
		<c:param name="myPhone" value="01047486110"></c:param>
	</c:url>
	<a href="${newUrl}" >페이지 이동</a>
	2. 파라미터로 들어온값 판단.
	<c:set var="score" value="${param.score }"></c:set>
	<h3>${score }</h3>
	<c:choose>
		<c:when test="${score >=90 }">
			<p>A 학점입니다.</p>
		</c:when>
		<c:when test="${score >=80 && score <90 }">
			<p>B 학점입니다.</p>
		</c:when>
		<c:otherwise>
			<p>F 학점입니다.</p>
		</c:otherwise>
	</c:choose>
	
	3. 다국어 테스트 <br>
	<fmt:setLocale value="ko_KR"/>
	<fmt:bundle basename="resource/member">
		<fmt:message key="mem.name" /> <br>
		<fmt:message key="mem.address" /> <br>
	</fmt:bundle>
	<fmt:setLocale value="en_US"/>
	<fmt:bundle basename="resource/member">
		<fmt:message key="mem.name" /> <br>
		<fmt:message key="mem.address" />
	</fmt:bundle>
</body>
</html>








