package action;

import javax.servlet.http.HttpServletRequest;

import service.InsertService;

public class InsertAction implements Action{
	@Override
	public Actionforward execute(HttpServletRequest request) throws Exception{
		
		// get or post 넘어오는 내용 가져오기
		System.out.println("이름 "+request.getParameter("name"));
		
		// 서비스 호출
		InsertService service = new InsertService();
		boolean result = service.insertArticle();
		
		if(result) {
			
		}
		//return 페이지이동방식(true,false), 페이지(String) 두개 리턴 하고 싶으면 하나의 객체로 만들면 된다.
		//sendRedirect 방식일 때 true, forward 방식일 때 false
		return new Actionforward(true, "list.jsp");
	}
}
