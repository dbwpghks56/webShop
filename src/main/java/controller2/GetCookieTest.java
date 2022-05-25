package controller2;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetCookieTest
 */
@WebServlet("/getc")
public class GetCookieTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetCookieTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 쿠키를 생성해서 응답문서에 추가하고 브라우져에 내려간다.
		String output = "";
		Cookie[] cookies = request.getCookies();
		
		for(Cookie c : cookies) {
			if(c.getName().equals("cookie_name")) {
				String s = URLDecoder.decode(c.getValue(), "utf-8"); // 한글은 요로코롬
				output += "<h3>" + c.getName() + " => " + s + "</h3>";
			} else {
				output += "<h3>" + c.getName() + " => " + c.getValue() + "</h3>";
			}
			
			System.out.println("쿠키이름 : " + c.getName());
			System.out.println("쿠키값 : " + c.getValue());
			
		}
		
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append("<h1>쿠키 읽기 예제</h1>").append(output);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
