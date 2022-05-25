package controller2;

import java.io.IOException;
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
@WebServlet("/SetCookieTest")
public class SetCookieTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetCookieTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 쿠키를 생성해서 응답문서에 추가하고 브라우져에 내려간다.
		Cookie c1 = new Cookie("cookie_name", URLEncoder.encode("유제환", "utf-8")); // 한글은 이렇게 적용해야 한다.
		Cookie c2 = new Cookie("cookie_phone", "010-4748-6110");
		Cookie c3 = new Cookie("cookie_title", "Englishtitle");
		
		c1.setMaxAge(60*3); // 1시간 = 60 * 60, 저식은 3분
		c2.setMaxAge(60*60);
		c3.setMaxAge(60*60*24); // 하루동안, 기본 시간을 설정하지 않고 쿠키를 만들면 일부러 지우지 않는한 안 지워진다.
		
		response.addCookie(c1);
		response.addCookie(c2);
		response.addCookie(c3);
		
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append("<h1>쿠키저장 예제</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
