package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class MemberLogoutAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// logout 은 get or post 할 게 없음
		// service 필요없음(DB 작업 없기에)
		
		// session 해제
		HttpSession session = request.getSession();
		session.removeAttribute("loginDto"); // or session.invalidate() : 다 날림
		// ActionForward : index.jsp
		return new ActionForward(true, "index.jsp");
	}

}
