package action;

import javax.servlet.http.HttpServletRequest;

public class DeleteAction implements Action{
	@Override
	public Actionforward execute(HttpServletRequest request) throws Exception {
		System.out.println("code "+request.getParameter("code"));
		return new Actionforward(true, "list.jsp");
	}
}
