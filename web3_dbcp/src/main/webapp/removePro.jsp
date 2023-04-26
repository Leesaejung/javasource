<%@page import="user.persistence.UserDAO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	// 사용자가 보는 페이지 아님
	// no값 가져오기
	int no = Integer.parseInt(request.getParameter("no"));

	UserDAO dao = new UserDAO();

	
	// 삭제 결과에 따라 페이지 이동(list.jsp)
	String path="";
	if(dao.remove(no)){
		path="listPro.jsp"; // insert 성공
	}else{
		path="getPro.jsp?no="+no; // insert 실패
	}
	response.sendRedirect(path);
	

%>