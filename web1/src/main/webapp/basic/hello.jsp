<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- JSP : Java Server Page
		   html 작성하기 편하게 되어있음
		   자바 코드를 사용할 수 있음 
		   
		   http://localhost:8080/web1/basic/hello.html
		   
		   프로젝트명 제거
		   http://localhost:8080/basic/hello.html
		   
		   http://localhost:8080 : 도메인명
		   localhost == 127.0.0.1 == 내 컴퓨터
		   8080 포트번호 ==> 변경가능
		   
		   /web1 : 프로젝트명
		   /basic : webapp 폴더 아래에 생성한 폴더
		   /hello.html : 파일명
-->
 <% 
  // 자바 코드 작성하기
  //HttpServletRequest request(변수): 사용자의 요청 가져오기
  
  // post방식의 데이터를 가져올 때 한글은 깨짐, get은 상관없음
 
  // 한글 깨지지 않도록 데이터 가져오기 전에 제일 먼저 코딩
  request.setCharacterEncoding("utf-8");
 
 // 중요 메소드 setCharacterEncoding, getParameter
 %>
 <h3>이름</h3> 
 <!-- 나오는데 문제 없으면 괜찮아요..이게 해석을 해서 보여주는 부분이라 에러가 없는데도 나오는 경우가 있어요..나중에 없어질 수도 있으니까 신경 안써도 되요 -->
 <%=request.getParameter("name") %>  
 <%=request.getParameter("age") %>
</body>
</html>