package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.UserDto;
import model.UserService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({"/LoginServlet", "/html/login.do"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html; charset=utf-8");
//		String id = request.getParameter("userid");
//		String pwd = request.getParameter("userpass");
//		System.out.println(id);
//		System.out.println(pwd);
//		System.out.println(request.getMethod());
//		System.out.println(request.getContextPath());
//		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher rd = request.getRequestDispatcher("loginform.html");
		rd.forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		String id = request.getParameter("userid");
		String pwd = request.getParameter("userpass");
		
		UserService service = new UserService();
		UserDto user = service.getUserData(id, pwd);
		
		// Session에 저장하기, why 다른페이지에서 로그인 여부를 알기 위해서
		// 쿠키 : 브라우져에 정보를 저장
		// 세션 : 정보는 서버에 저장, 브라우져에 세션 id 저장
		HttpSession session = request.getSession();
		
		session.setAttribute("user", user);
		
		if(user == null) {
			response.sendRedirect("login.do");
		} else {
			response.sendRedirect("../board/boardlist.do");
		}
		
//		System.out.println(id);
//		System.out.println(pwd);
//		System.out.println(request.getMethod());
//		System.out.println(request.getContextPath());
		
//		PrintWriter out = response.getWriter();
//		out.write("<h1>로그인 성공</h1>");
//		out.write("<h2>DB 접속 후 다시 수정하기</h2>");
		
		// 서블릿 결과를 JSP에 위임한다. 주소창은 변경되지않는다.
//		RequestDispatcher rd = request.getRequestDispatcher("../jsp/loginResult.jsp");
//		rd.forward(request, response);
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
