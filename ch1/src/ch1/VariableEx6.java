package ch1;

import java.util.Scanner;

/* 
 * 
 * 키보드에서 입력받기
 * 
 */

public class VariableEx6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 사용자가 두개의 피연산자를 입력받기
		System.out.printf("첫번째 수 입력 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.printf("두번째 수 입력 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		// 사칙연산 결과 출력
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		/*
		 * System.out.println("나누기는 "+(num1/num2)); 이건 뒤에 연산을 먼저 해줘야 하니까 괄호가 있어야함
		 * System.out.println("나누기는 "+num1/num2); 이건 뒤에 연산을 먼저 해줘야 하니까 괄호가 있어야하는데 없으니까 오류 발생
		 */		
		
		System.out.printf("더하기는 = %d\n", num1+num2);
		System.out.printf("빼기는 = %d\n", num1-num2);
		System.out.printf("곱하기는 = %d\n", num1*num2);
		System.out.printf("나누기는 = %d\n", num1/num2);
				
	}

}
