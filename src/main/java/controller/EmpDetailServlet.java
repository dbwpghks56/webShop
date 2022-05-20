package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.EmpVo;
import model.EmpDAO;
import model.EmpService;

/**
 * Servlet implementation class EmpDetailServlet
 */
@WebServlet("/emp/empDetail.do")
public class EmpDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empid = request.getParameter("empid");
		System.out.println(empid);
		
		EmpService empService = new EmpService();
		EmpVo emp = empService.selectById(Integer.parseInt(empid));
		
		if(emp != null) {
			request.setAttribute("emp", emp);
			RequestDispatcher rd = request.getRequestDispatcher("../emp/empDetail.jsp");
			rd.forward(request, response);
		}
		
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empid = request.getParameter("empid");
		System.out.println(empid);
		
		EmpService empService = new EmpService();
		EmpVo emp = empService.selectById(Integer.parseInt(empid));
		
		if(emp != null) {
			request.setAttribute("emp", emp);
			RequestDispatcher rd = request.getRequestDispatcher("../emp/empDetail.jsp");
			rd.forward(request, response);
		}
		
		
	}

}















