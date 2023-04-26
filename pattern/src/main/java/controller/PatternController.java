package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.DeleteAction;
import action.InsertAction;

/**
 * Servlet implementation class PatternController
 */
@WebServlet("*.do") // Url mapping, 아무거나 들어와도 됨 단 끝은 .do로 끝나야함
public class PatternController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String requestURI = request.getRequestURI(); 
		String contextPath = request.getContextPath(); //프로젝트 == context
		String cmd = requestURI.substring(contextPath.length());
		
		System.out.println("requestURI"+requestURI);
		System.out.println("contextPath"+contextPath);
		System.out.println("cmd"+cmd);
		
		Action action = null;
		
		// 어디에서 요청이 왔는지
		if(cmd.equals("/insert.do")){
			action = new InsertAction();
			try {				
				action.execute(request);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(cmd.equals("/list.do")) {
			
		}else if(cmd.equals("/update.do")) {
			
		}else if(cmd.equals("/delete.do")) {
			action = new DeleteAction();
			try {
				action.execute(request);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
