<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	// cookie2에서 사용자가 선택한 값을 쿠키에 저장한 후 응답 헤더에
	// 쿠키 붙여서 보내기
	
	Cookie cookie = new Cookie("language", request.getParameter("language")); // language란 이름으로 쿠키 생성
	// 쿠키 만료 시간(쿠키 만료 시간을 지정하지 않으면 세션과 같은 개념)
	cookie.setMaxAge(60*60*24);
	// 사용자에게 응답 시 쿠키 전송
	response.addCookie(cookie);
	// 원래 있던 페이지로 돌려보내기
	response.sendRedirect("cookie2.jsp");
%>