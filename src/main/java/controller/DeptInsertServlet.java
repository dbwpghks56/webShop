package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.DeptDto;
import model.DeptService;

/**
 * Servlet implementation class DeptInsertServlet
 */
@WebServlet("/dept/deptInsert.do")
public class DeptInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeptInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("deptInsert.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		int dno = Integer.parseInt(request.getParameter("department_id"));
		String d_name = request.getParameter("department_name");
		int mno = Integer.parseInt(request.getParameter("manager_id"));
		int lno = Integer.parseInt(request.getParameter("location_id"));
		
		DeptDto dept = new DeptDto(dno, d_name, mno, lno);
		DeptService service = new DeptService();
		
		request.setAttribute("message", service.deptInsert(dept) > 0 ? "등록 성공" : "등록 실패");
		
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
		
		doGet(request, response); 
	}

}













