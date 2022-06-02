package designpattern;

import javax.servlet.http.HttpServletRequest;

import model.EmpService;

public class EmpListController implements Command {

	@Override
	public String execute(HttpServletRequest req) {
		EmpService service = new EmpService();
		
		req.setAttribute("emplist", service.allselect());
		
		return "empList.jsp";
	}

}
