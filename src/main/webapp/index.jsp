<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
    </head>

    <body>
        <h1>jsp, servlet 학습하기</h1>
        <h2>get요청 1</h2>
        <a href="FirstServlet">FirsetServlet 요청</a>
        <h2>get요청 2</h2>
        <form action="FirstServlet" method="get">
        	<input type="submit" value="firstservlet 요청(get)">
        </form>
        <h2>post요청 1</h2>
        <form action="FirstServlet" method="post">
        	<input type="submit" value="firstservlet post">
        </form>
        <button id="btn1">get요청</button>
        <script type="text/javascript">
        	btn1.onclick = () => {
        		location.href = "/webShop/first"
        	};
        </script>
    </body>

    </html>