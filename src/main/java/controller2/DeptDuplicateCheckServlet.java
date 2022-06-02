package controller2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.DeptDto;
import model.DeptService;

/**
 * Servlet implementation class DeptDuplicateCheckServlet
 */
@WebServlet("/dept/duplicateCheck.do")
public class DeptDuplicateCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeptDuplicateCheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String deptid = request.getParameter("deptid");
		System.out.println(deptid);
		
		// DB에 부서 id가 존재하는지 체크한다.
		DeptService dservice = new DeptService();
		DeptDto dept = dservice.selectById(Integer.parseInt(deptid));
		
		PrintWriter out = response.getWriter();
		
		out.print(dept == null ? 0 : 1);
	}


}





