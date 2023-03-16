package ch6;

public class Member {
	// 아이디 userid ex)hong123
	// 비밀번호 password ex)hong1230@!
	// 비밀번호 확인 comfirmPassword ex)hong123@!
	// 전화번호 hp ex)01012341234
	// 주소 address ex)서울
	String userid;
	String password;
	String comfirmPassword;
	String hp;
	String address;
	
	//위에 꺼 쓰면 무조건 생성자 만들기 ex)public Member.......
	
	public Member(String userid, String password, String comfirmPassword, String hp) {
		super();
		this.userid = userid;
		this.password = password;
		this.comfirmPassword = comfirmPassword;
		this.hp = hp;
	}

	
	public Member(String userid, String password, String comfirmPassword, String hp, String address) {
		super();
		this.userid = userid;
		this.password = password;
		this.comfirmPassword = comfirmPassword;
		this.hp = hp;
		this.address = address;
	}



	boolean passwordAndComfirmPasswordEquals(){
		//문자열 비교 == 사용하면 안됨
		//equals()
		return password.equals(comfirmPassword);


	}
	
}
