package service;

import domain.BookDTO;
import persistense.BookDAO;

public class BookReadService {
	// DAO 부르는게 목적
	public BookDTO read(int code) {
		BookDAO dao = new BookDAO();
		return dao.getRow(code);
	}
}
