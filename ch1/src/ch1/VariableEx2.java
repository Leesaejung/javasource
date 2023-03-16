package ch1;

public class VariableEx2 {

	public static void main(String[] args) {
		
		// 변수 : 단 하나의 값만 저장할 수 있는 메모리 공간
		// 타입 변수명 = 값; --> int num = 1;
		// 메모리에 어떤 값을 저장할 것인가? 에 따라 타입이 결정됨
		// 문자 : 문자 ( '가' - char(2byte) ), 문자열 ( "가나다라" ) 
		// 숫자 : 정수 - byte(1byte=8bit), short(2byte), int(4byte), long(8byte) (각각 쓰는 공간의 차이가 있음)
		// 숫자 : 실수 - float(4byte), double(8byte)
		// 논리 : 참(true), 거짓(false)
		
		// 자바의 문장 끝은 세미클론으로 끝내야 한다
		
		// 변수의 선언(int a;)과 초기화(a=10)
		// byte = -128 ~ 127
		int a = 128, b = 5;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		// 실수형을 담을 때 기본으로 인식하는 타입은 double
		// 정밀도 차이 세밀하게 하겠다 -> double, 7자리로 나오면 됨 -> float
		
		double d1 = 0.12345678909; // D 붙여서 써도 되고 안 써도 상관없음
		float f1 = 0.12345678909F; // 리터럴(예시 : 3.14) 뒤에 붙는 f는 대소문자 구별 안함
		
		System.out.println("d1 = "+d1);
		System.out.println("f1 = "+f1);
		
		// 논리형
		
		boolean b1 = true;
		System.out.println(b1);
		
		String b2 = "true"; //true 라는 그냥 글자임, 위에랑 다름
		System.out.println(b2);
		
		// 문자형
		// 빈문자열도 프로그래밍 언어에서는 문자의 개념 
		
		char ch1 = 'a';
		System.out.println(ch1);
		System.out.println(ch1+1); //a : 97, A = 65 (정해져있음) --> 유니코드
		
		
		

	}

}
