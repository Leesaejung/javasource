package action;

import javax.servlet.http.HttpServletRequest;

public interface Action {
	public Actionforward execute(HttpServletRequest request) throws Exception;
}
