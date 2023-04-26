package service;

import domain.BookDTO;
import persistense.BookDAO;

public class BookInsertService {
	public boolean insertBook(BookDTO insertDto) {
		BookDAO dao = new BookDAO();
		return dao.insert(insertDto);
	}
}
