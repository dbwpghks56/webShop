<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="dto.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>장바구니 현황</h1>
	<%
		String prodName = request.getParameter("prod");
		String s_count = request.getParameter("count");
		int i_count = 0;
		
		if(s_count != null) {
			i_count = Integer.parseInt(s_count);
		}
		
		Product pro = new Product(prodName,i_count);
		
		Map<String, Product> plist = new HashMap<>();
		
		if(session.getAttribute("cart2") != null) {
			plist = (HashMap)session.getAttribute("cart2");
		}
		
		
		if(plist.containsKey(prodName)) {
			Product value = plist.get(prodName);
			value.setCount(value.getCount()+ i_count);
		} else{
			plist.put(prodName, pro);
		}
		
		session.setAttribute("cart2", plist);
		
		// 출력
		for(String key : plist.keySet()) {
			out.write("<p>상품 이름 : " + plist.get(key).getName() + ", 갯수 : " + plist.get(key).getCount() + "</p>");
		}
	%>
	<a href="input.jsp">계속 구매하기</a>
	<button id="btnClear" onclick="location.href='cartRemove'">장바구니 비우기</button>
</body>
</html>













