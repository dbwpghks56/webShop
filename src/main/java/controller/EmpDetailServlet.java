package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.EmpVo;
import model.EmpDAO;
import model.EmpService;
import util.DateUtil;

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
		request.setCharacterEncoding("utf-8");
		
		String s_emp = request.getParameter("empno");
		System.out.println(s_emp);
		
		EmpVo emp = makeEmp(request);
		EmpService empService = new EmpService();
		
		request.setAttribute("message", empService.updateEmp(emp, Integer.parseInt(s_emp)) > 0 ? "성공" : "실패");
		
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
		
	}

	private EmpVo makeEmp(HttpServletRequest request) {
		EmpVo emp = new EmpVo();
		readDate(request, "문장");
		readDouble(request, "문장");
		
		
		return emp;
	}

	private double readDouble(HttpServletRequest request, String string) {
		String data = request.getParameter(string);
		
		return Double.parseDouble(data);
		
	}

	private Date readDate(HttpServletRequest request, String string) {
		String data = request.getParameter(string);
		
		return DateUtil.convertToDate(data);
		
	}

}















