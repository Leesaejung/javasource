package ch3;

import java.util.Scanner;

public class SwitchEx4 {

	public static void main(String[] args) {
		// +, -, *, /, %
		
		//사용자로부터 두개의 피연산자와 연산자를 입력받기
		//연산을 수행한 후 출력
		
		Scanner sc =  new Scanner(System.in);
		
		
		System.out.printf("첫번째 숫자를 입력하세요 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.printf("두번째 숫자를 입력하세요 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.printf("연산자를 입력하세요 : ");
		
		// 내가 쓴것
		String opt = sc.nextLine();
		switch (opt) {
		case "+":
			System.out.println("두 수의 덧셈의 값은 : "+(num1+num2));
			break;
		case "-":
			System.out.println("두 수의 뺄셈의 값은 : "+(num1-num2));
		break;
		case "*":
			System.out.println("두 수의 곱셈의 값은 : "+(num1*num2));
		break;
		case "/":
			System.out.println("두 수를 나눈 몫의 값은 : "+(num1/num2));
		break;
		default:
			System.out.println("두 수를 나눈 나머지의 값은 : "+(num1%num2));
			break;
		}
		
		//답
		int result = 0;
		switch (opt) {
		case "+":
			result = num1+num2;
			break;
		case "-":
			result = num1-num2;
			break;
		case "*":
			result = num1*num2;
			break;
		case "/":
			result = num1/num2;
			break;
		default:
			result = num1%num2;
			break;
		}
		System.out.printf("%d %s %d = %d",num1,opt,num2,result);
	}

}
