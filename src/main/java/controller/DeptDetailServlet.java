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
 * Servlet implementation class DeptDetailServlet
 */
@WebServlet("/dept/dept.do")
public class DeptDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeptDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String deptid = request.getParameter("dept_id");
		System.out.println(deptid);
		
		int idept = Integer.parseInt(deptid);
		DeptService dService = new DeptService();
		DeptDto dept = dService.selectById(idept);
		
		if(dept != null) {
			request.setAttribute("deptname", dept.getDepartment_name());
			request.setAttribute("mid", dept.getManager_id());
			request.setAttribute("loc", dept.getLocation_id());
		}
		
		request.setAttribute("dept", dept);

		RequestDispatcher rd = request.getRequestDispatcher("../dept/deptDetail.jsp");
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















