package service;

import java.util.List;

import domain.BookDTO;
import persistense.BookDAO;

//~~service : 비즈니스 로직을 처리한다.
//	

public class BookListService {
	//BookDAO의 List<BookDTO> 출력
	public List<BookDTO> list() {
		BookDAO dao = new BookDAO();
		List<BookDTO> list = dao.getList();
		
		return list;
	}
}
