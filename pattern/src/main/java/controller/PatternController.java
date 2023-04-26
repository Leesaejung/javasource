package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.ActionFactory;
import action.Actionforward;
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
		
		String requestURI = request.getRequestURI();    //pattern/list.do
		String contextPath = request.getContextPath(); //프로젝트 == context   //pattern
		String cmd = requestURI.substring(contextPath.length()); //list.do
		
		System.out.println("requestURI"+requestURI);
		System.out.println("contextPath"+contextPath);
		System.out.println("cmd"+cmd);
		
		
		ActionFactory actionFactory = ActionFactory.getInstanse(); //new 하면 생성자 안 보임, 그래서 싱글톤 패턴으로 만듦 
		Action action = actionFactory.action(cmd);
		
		
		// 생선된 액션에 일 시키기(메소드 호출)
		Actionforward af = null;
			try {
				 af = action.execute(request);  //execute => 가져오는 작업
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			// 
			if(af.isRedirect()) {
				response.sendRedirect(af.getPath());
			}else {
				RequestDispatcher rd = request.getRequestDispatcher(af.getPath());
				rd.forward(request, response);
			}
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
