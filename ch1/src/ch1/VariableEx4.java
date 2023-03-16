package ch1;

/* 리터럴
 * 대입되는 값(상수)
 * 
 * 정수형 : long
 */

public class VariableEx4 {

	public static void main(String[] args) {
		//접미사 : l, f, d
		long big = 100_000_000_000L; //_는 , 같은 기호
		float f =0.14159f;
		double d = 0.14159d; //d는 필수가 아님
		
		//접두사 : 0, 0x, 0b
		int octNum = 010; //8진수 10 == > 10진수
		int hexNum = 0x10;//16진수 10
		int binNum = 0b10;//2진수로 10
		
		System.out.println(octNum);
		System.out.println(hexNum);
		System.out.println(binNum);
		
		// 타입이 달라도 저장범위가 넓은 타입에 좁은 타입의 값을 저장하는 것은 허용됨
		// 'A' : 2byte
		// int : 4byte
		
		int i ='A';
		System.out.println(i);
		
		// "" : 문자열
		// String : 참조 타입
		String name ="hong";
		
		//1. name 값 가져오기
		//2. 문자 77을 연결하기
		//3. 연결한 값을 name에 담기
		name = name + " 77";
		System.out.println(name);
		
		String num = 7+7+"7"; //14 + "7"
		System.out.println(num);
		
		
		//printf() : 형식화된 출력
		// %d : 10진 정수의 형식 출력
		// %c : 문자
		// %s : 문자열
		// %f : 부동소수점
		int age = 25;
		System.out.println("age="+age);
		System.out.printf("age=%10d\n" ,age); //%10d --> 앞에 10칸
		
		char ch1 = 'a';
		String str1 = "abcd";
		double d1 = 3.141592;
		System.out.printf("ch1=%10c\n", ch1);
		System.out.printf("str1=%s\n", str1);
		System.out.printf("%-10s\n", str1); //뒤에 10개의 칸, 오른쪽 정렬
		System.out.printf("%10s\n", str1); //앞에 10개의 칸, 왼쪽 정렬
		System.out.printf("d1=%10.3f\n", d1); //.3f -> 소수점 세자리 뒤까지만 출력
	}

}
