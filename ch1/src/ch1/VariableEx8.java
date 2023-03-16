package ch1;

import java.util.Scanner;

/* 
 * 형변환 : 강제형변환(casting), 자동형변환(작은 -> 큰)
 * boolean을 제외한 나머지 7개의 기본형은 서로 형변환 가능
 * 정수형 -> 실수형
 * 실수형 -> 정수형
 * 자동형변환
 * byte -> short, char -> int -> long -> float -> double
 */

public class VariableEx8 {
	public static void main(String[] args) {
		
		int i = 91234567;
		//float f = i;
		float f = (float)i;
		//큰 타입을 작은 타입에 담는 것은 오류 발생
		//변경 타입을 앞에 써줘야함(casting)
		int i2 =(int)f; //이렇게 쓰면 값의 손실이 일어날 수 있음
		
		System.out.printf("i=%d\n", i);
		System.out.printf("f=%f i2=%d\n", f,i2);
		
		//자동형변환(작은걸 큰것에 넣었을 때) : 변경 타입 생략 가능 
		byte byteValue = 10;
		int intVal = byteValue;
		System.out.printf("intVal = %d\n" ,intVal);
		
		char charVal = 'a';
		intVal = charVal;
		System.out.printf("intVal = %d\n" ,intVal);
		System.out.printf("charVal = %c\n" ,charVal);
		
		double d = 5.5;
		double result = intVal + d;
		System.out.printf("result = %f\n" ,result);
		
		// \n 줄바꿈 \t 탭(공백)
		System.out.println("abc\tdef");
		System.out.println("abc\\def");
		System.out.println("c:\\");
		
	}

}
