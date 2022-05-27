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
	<c:if test="${user != null }">
		<p>${user.getUserName() }</p>
	</c:if>
	<c:if test="${user == null }">
		<p>Guest</p>
	</c:if>
	
</div>