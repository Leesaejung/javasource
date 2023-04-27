package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import domain.BookDTO;
import domain.SearchDTO;
import service.BookSearchService;

public class BookSearchAction implements BookAction {

	@Override
	public BookActionForward execute(HttpServletRequest request) throws Exception {
		// get or post 넘어오는 내용 가져오기
		String criteria = request.getParameter("criteria");
		String keyword = request.getParameter("keyword");
		// service를 통해 데이터베이스 작업
		BookSearchService service = new BookSearchService();
		List<BookDTO> list = service.list(criteria, keyword);
		
		SearchDTO searchDTO = new SearchDTO(criteria, keyword);
//		request.setAttribute("criteria", criteria);
//		request.setAttribute("keyword", keyword);
		// 위의 것 한꺼번에
		request.setAttribute("searchDTO", searchDTO);
		request.setAttribute("list", list);
		
		// ActionForward
		return new BookActionForward(false, "list.jsp");
		
	}

}
