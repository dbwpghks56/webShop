package controller2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContextTest
 */
@WebServlet("/ServletContextTest")
public class ServletContextTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContextTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 서블릿이 직접 응답
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		ServletContext app = getServletContext();
		System.out.println("getContextPath : "+app.getContextPath());
		System.out.println("getMajorVersion : "+app.getMajorVersion());
		System.out.println("getMinorVersion : "+app.getMinorVersion());
		System.out.println("getRealPath : "+app.getRealPath("."));
		System.out.println("getRealPath(board) : "+app.getRealPath("./board"));
		
		app.setAttribute("myname", "Jae"); // 아이디 저장할 때 유용할
		request.setAttribute("address", "금천구 가산동");
		System.out.println("getAttribute(myname) : "+app.getAttribute("myname"));
		System.out.println("getAttribute(address) : "+app.getAttribute("address"));
		
		RequestDispatcher rd = request.getRequestDispatcher("jsp/contextTest.jsp");
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
















