package controller2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UrlPatternTest
 */
@WebServlet("/first/test1")
public class UrlPatternTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UrlPatternTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("getContextPath : "+request.getContextPath()); // 결과 : /webShop
		System.out.println("getRequestURL : "+request.getRequestURL());
		System.out.println("getRequestURI : "+request.getRequestURI());
		System.out.println("getServletPath : "+request.getServletPath());
		System.out.println("getServerPort : "+request.getServerPort());
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


}








