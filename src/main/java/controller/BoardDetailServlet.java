package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.BoardDto;
import model.BoardService;

/**
 * Servlet implementation class BoardDetailServlet
 */
@WebServlet("/board/board.do")
public class BoardDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String id = request.getParameter("boardid");
		System.out.println(id);
		BoardService boardservice = new BoardService();
		BoardDto board = boardservice.selectById(Integer.parseInt(id));
		
		if(board != null) {
			request.setAttribute("board", board);
			
		}
		RequestDispatcher rd = request.getRequestDispatcher("../board/boardDetail.jsp");
		rd.forward(request, response);
	}
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("boardid");
		System.out.println(id);
		BoardService boardservice = new BoardService();
		BoardDto board = boardservice.selectById(Integer.parseInt(id));
		
		if(board != null) {
			request.setAttribute("board", board);
			
		}
		RequestDispatcher rd = request.getRequestDispatcher("../board/boardDetail.jsp");
		rd.forward(request, response);
	}

}











