package ch6;

public class MemberEx {

	public static void main(String[] args) {
		Member member1 = new Member("hong123","hong123@!","hong123@!","01012341234");
		Member member2 = new Member("hong123","hong123@!","hong123@!","01012341234", "서울 종로구");
		
		if(member1.passwordAndComfirmPasswordEquals()) { //true라면 비밀번호가 일치합니다
											//false라면 비밀번호를 확인해 주세요 메세지 출력
		System.out.println("비밀번호가 일치합니다.");
		}else {
			System.out.println("비밀번호를 확인해주세요");
		}
		System.out.println(member2.passwordAndComfirmPasswordEquals()?"비밀번호가 일치합니다.":"비밀번호를 확인해주세요.");
			
		
			memberInfo(member1); //member1과 member2  내용 출력하기 
			memberInfo(member2);
		}
		

		
		//위의 memberInfo는 아래의 memberInfo를 통해 사용할 수 있음
		//메인이 스테틱 메소드이니까 아래에도 스테틱 메소드를 쓰면 오류가 안 생기고 좋다
		static void memberInfo(Member member) {
			//출력결과
			System.out.println("아이디 : "+member.userid);//아이디 : 초기값 출력
			System.out.println("비밀번호 : "+member.password);//비밀번호 : 초기값 출력
			System.out.println("전화번호 : "+member.hp);//전화번호 : 초기값 출력
			System.out.println("주소 : "+member.address);//주소 : 초기값 출력
			
			
			
		}

}
	

