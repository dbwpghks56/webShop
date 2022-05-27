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

/**
 * Servlet Filter implementation class EncodeFilter
 */
//@WebFilter("*.do") // 모든 주소창에서(모든 요청에서)
public class EncodeFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public EncodeFilter() {
       System.out.println("필터 생성");
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("필터 소멸");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		request.setCharacterEncoding("utf-8");
		
		HttpServletRequest req = (HttpServletRequest)request;
		
		System.out.println("getContextPath : "+req.getContextPath()); // 결과 : /webShop
		System.out.println("getRequestURL : "+req.getRequestURL());
		System.out.println("getRequestURI : "+req.getRequestURI());
		System.out.println("getServletPath : "+req.getServletPath());
		System.out.println("getServerPort : "+req.getServerPort());
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
