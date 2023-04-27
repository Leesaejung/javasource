package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import domain.MemberDTO;
import service.MemberLoginService;

public class MemberLoginAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// post 가져오기
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		
		// service 가져오기
		MemberLoginService service = new MemberLoginService();
		MemberDTO loginDto = service.login(userid, password);
		
		String path= "";
		// 로그인 실패 시 MemberDTO dto = null; DAO의 이 문구에 의해 null 값이 리턴됨
		// 보통 로그인 정보는 세션에 담음, session을 쓰려면 HttpSession을 통해 가져와야함
		if(loginDto != null) {
			HttpSession session = request.getSession();
			session.setAttribute("loginDto", loginDto);
			path = "index.jsp";
		} else {
			path = "login.jsp";
		}
		// ActionForward 가져오기
		return new ActionForward(true, path);
	}

}
