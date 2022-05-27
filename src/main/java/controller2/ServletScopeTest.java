package controller2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletScopeTest
 */
@WebServlet("/ServletScopeTest")
public class ServletScopeTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletScopeTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// server가 살아있는 동안 (started) 모든 jsp/servlet에서 접근 가능
		ServletContext application = getServletContext();
		
		application.setAttribute("appVar", "server가 살아있는 동안 (started) 모든 jsp/servlet에서 접근 가능");
		application.setAttribute("myphone", "1");
		application.setAttribute("myphone", "2");
		application.setAttribute("myphone", "3");
		// 브라우져가 살아있는 동안 모든 jsp/servlet에서 접근 가능
		HttpSession session = request.getSession();
		
		session.setAttribute("sessionVar", "브라우져가 살아있는 동안 모든 jsp/servlet에서 접근 가능");
		
		// HTTPServletRequest request : 요청이 살아있는 동안(요청이 바뀌지않는 동안) jsp/servlet에서 접근 가능
		request.setAttribute("requestVar", "요청이 살아있는 동안(요청이 바뀌지않는 동안) jsp/servlet에서 접근 가능");
		
		RequestDispatcher rd = request.getRequestDispatcher("jsp/scopeTest.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}










