package controller2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigTest
 */
@WebServlet(
		urlPatterns = { 
				"/ServletConfigTest", 
				"/config1", 
				"/config2"
		}, 
		initParams = { 
				@WebInitParam(name = "Name", value = "me"), 
				@WebInitParam(name = "phone", value = "010-4748-6110"), 
				@WebInitParam(name = "address", value = "금천구 가산동")
		})
public class ServletConfigTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String name = getInitParameter("Name");
		String phone = getInitParameter("phone");
		String address = getInitParameter("address");
		
		System.out.println(name);
		System.out.println(phone);
		System.out.println(address);
	}

}












