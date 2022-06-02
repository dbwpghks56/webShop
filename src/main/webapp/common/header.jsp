<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
	.right {
		float: right;
	}
</style>
<div class="right">
	<span> <a href="../logOut">로그아웃</a>
	</span>
	<c:set var="path" value="${pageContext.request.contextPath }"></c:set>
	<c:if test="${user != null }">
		<p>${user.getUserName() }</p>
	</c:if>
	<c:if test="${user == null }">
		<p>Guest</p>
	</c:if>
	
	<c:if test="${user == null }">
		<a class="right" href="${path }/html/login.do">로그인하기</a>
	</c:if>
	<c:if test="${user != null }">
		<a class="right" href="${path }/logOut">로그아웃</a>
	</c:if>
	<%-- <c:choose> <!-- else if 쓸 때 이렇게 쓰면 된다. -->
		<c:when test="${user == null }"></c:when>
		<c:otherwise></c:otherwise>
	</c:choose> --%>
	
</div>