package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import domain.BookDTO;
import service.BookListService;

public class BookListAction implements BookAction {

	@Override
	public BookActionForward execute(HttpServletRequest request) throws Exception {
		//get or post 넘어오는 내용 가져오기 => 없으면 안 하면 됨
		//service를 통해 데이터베이스 작업 처리
		BookListService service = new BookListService();
		List<BookDTO> list = service.list();
		
		request.setAttribute("list", list); // request.setAttribute => forward
		
		return new BookActionForward(false, "list.jsp");
	}

}
