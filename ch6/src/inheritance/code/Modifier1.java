package inheritance.code;

import modifier.Account;


public class Modifier1 {
	//참조 타입은 null로 세팅
	//java.lang.NullPointerException -> 이런 오류 안 나려면 인스턴스 생성 new ~~~~();
	Account acc = new Account(); //The type modifier.Account is not visible(public이 생략됬을 경우)
	
	int age; // 기본 타입은 전수형 - 0, 실수형 - 0,  boolean-false으로 세팅
	
	void print() {
		//Account가 가지고 있는 ano에 접근하고 싶다면?
		String ano = acc.getAno();
		System.out.println("ano : "+ano);
		
		acc.setAno("111-22");
		System.out.println("ano : "+acc.getAno());
	}
	
	public static void main(String[] args) {
		//static 메소드에서 non-static 메소드 호출하기
		//1. 같은 static으로 만들기
		//2. 객체 생성 후 접근하기
		Modifier1 modifier1 = new Modifier1();
		modifier1.print();

	}
}
