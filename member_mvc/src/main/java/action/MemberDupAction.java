package action;

import javax.servlet.http.HttpServletRequest;

import service.MemberDupService;

public class MemberDupAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// post 가져오기
		String userid = request.getParameter("userid");
		
		MemberDupService service = new MemberDupService();
		boolean dupFlag = service.dupId(userid);
		
		if (dupFlag) {
			request.setAttribute("dupId", "true");
		}else {
			request.setAttribute("dupId", "false");
		}
		
		// Action Forward
		return new ActionForward(false, "checkId.jsp");
	}

}
