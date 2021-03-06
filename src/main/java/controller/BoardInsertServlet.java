package controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.BoardDto;
import model.BoardService;
import util.UploadFileHelper;

/**
 * Servlet implementation class BoardInsertServlet
 */
@WebServlet("/board/boardInsert.do")
public class BoardInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext app = getServletContext();
		String name = (String)app.getAttribute("myname");
		System.out.println(name);
		
		RequestDispatcher rd = request.getRequestDispatcher("boardInsert.jsp");
		rd.forward(request, response);
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String writer = request.getParameter("writer");
		String message = "등록실패";
		
		Map<String, Object> map = UploadFileHelper.uploadFile("uploads", request);
		
		List<String> pics = (List<String>)map.get("potos");
		String pic = pics.get(0);
		
//		Map<String, Object> map = (Map<String, Object>)UploadFileHelper.uploadFile("uploads", request);
//		List<String> fileNames = (List<String>)map.get("potos");
//		Map<String, String> mapParam = (Map<String, String>)map.get("params");
//		String pic = fileNames.get(0);
//		BoardDto board = new BoardDto();
//		for(String key:mapParam.keySet()) {
//			if(key.equals("title")) board.setTitle(mapParam.get(key));
//			if(key.equals("content")) board.setContent(mapParam.get(key));
//			if(key.equals("writer")) board.setWriter(Integer.parseInt(mapParam.get(key)));
//		}
//		board.setPic(pic);
		
		
		BoardDto board = new BoardDto(0, title, content, writer, null, null, pic);
		
		BoardService service = new BoardService();
		
		int result = service.insertBoard(board);
		
		if(result > 0) {
			message = "등록성공";
		}
		
		request.setAttribute("message", message);
		
		// redirect : 주소창의 바꾼다.
		response.sendRedirect("boardlist.do");
		System.out.println(board);
		
//		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
//		rd.forward(request, response); // 주소창을 바꾸지않는다. 요청과 응답이 다른 문서
		
		
		
	}

}
