package ch1;

//ctrl + / 주석 : 상세설명
/* 변수명 규칙
 * 대소문자 구별, 길이에 제한은 없음
 * 예약어 사용 불가 (ex. int true; )
 * 숫자로 시작 불가 (ex. int 7d;)
 * 특수문자는 _, $만 허용 (ex. int s#arp)
 * 
 * 변수의 첫글자는 항상 소문자
 * 여러 단어로 이루어진 이름은 단어의 첫글자를 대문자로 한다(lastIndexOf)
 */

public class VariableEx3 {

	public static void main(String[] args) {
		
		
		//기본 타입
		//문자 : char
		//숫자 : 정수(byte, short, int, long)
		//숫자 : 실수(float, double)
		//논리 : boolean
		
		// 두 변수의 값 교환
		int x= 10, y = 20;
		
		//비어있는 공간 작성
		int temp = 0;
		
		//둘중 하나의 값 옮기기
		temp=x;
		
		//나머지 값 옮기기
		x=y;
		y=temp;
		
		/*
		 * //출력 
		 * System.out.println("x= "+x+", y = "+y); // +는 앞의 문자열과 더해서 연결해달란 의미
		 * System.out.println("x = " + x); System.out.println(x);
		 */
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		

	}

}
