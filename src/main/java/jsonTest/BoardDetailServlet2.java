package jsonTest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import dto.BoardDto;
import model.BoardService;

/**
 * Servlet implementation class BoardDetailServlet
 */
@WebServlet("/board/board2.do")
public class BoardDetailServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardDetailServlet2() {
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
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		
		if(board != null) {
			// JSON 객체 만들기
			JSONObject obj = new JSONObject(); // {}
			obj.put("board_id", board.getBno());
			obj.put("board_title", board.getTitle());
			obj.put("board_content", board.getContent());
			obj.put("board_writer", board.getWriter());
			
			String jsonStr = obj.toJSONString();
			writer.print(jsonStr);
		}
	}

}











