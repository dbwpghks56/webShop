package filterListener;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.UserDto;

/**
 * Servlet Filter implementation class SessionFilter
 */
@WebFilter("/*")
public class SessionFilter extends HttpFilter implements Filter {
       

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		
		HttpServletRequest req = (HttpServletRequest)request;
		
		HttpSession session = req.getSession();
		
		String path = req.getServletPath();
		
		
		System.out.println("요청 path : " + path);
		if(!path.equals("/html/login.do")) {
			
			UserDto user = (UserDto) session.getAttribute("user");
			
			if(user == null) {
				System.out.println("로그인을 하지 않음...");
				// 절대 경로가 바람직하다.
				session.setAttribute("realpath", path);
				((HttpServletResponse)response).sendRedirect(req.getContextPath() + "/html/login.do");
				return;
			}
		}
		
		
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}
}
