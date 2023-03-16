package ch3;

import java.util.Scanner;

/* 조건문
 * 조건식과 실행될 하나의 문장 또는 블럭으로 구성됨
 * 종류 : if(주로 사용), switch
 * 
 * 
 * 1. if
 * 1) if
 * 3) if~else
 * 3) if~else if
 * */
public class IfEx4 {

	public static void main(String[] args) {
		// 근무 시간 입력받기
		// 8시간 근무시 9800 일 때
		// 초과근무시 1.5배를 지급
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("근무시간을 입력해주세요 : ");
//		int hours = Integer.parseInt(sc.nextLine());
//		int pay = 0;
//		int rate = 8900; //시간당 급여
//		
//		if (hours>8) {
//			pay = (int)((hours-8)*1.5*rate+rate*8);
//		}
//		else {
//			pay = rate*hours;
//		}
//		System.out.println("당신의 하루 급여는 : "+pay+"입니다.");
		
		//사용자로부터 키와 몸무게를 입력받기
		//저체중인지 표준, 과체중 출력하는 프로그램
		// (키 - 100)*0.9 < 몸무게 : 과체중
		// (키 - 100)*0.9 = 몸무게 : 표준
		// (키 - 100)*0.9 > 몸무게 : 저체중
		// if~else if, if~else if~else
		System.out.printf("몸무게를 입력해주세요 : ");
		double weight = Double.parseDouble(sc.nextLine());
		System.out.printf("키를 입력해주세요 : ");
		double height = Double.parseDouble(sc.nextLine());
		String result;
		
		if ((height-100)*0.9<weight) {
			result = "과체중";
		}
		else if((height-100)*0.9==weight) {
			result = "표준";
		}
		else {
			result = "저체중";
		}
		
		System.out.println("당신은 "+result+" 입니다.");
		
//				윤년, 평년 구하기
//				윤년 : 연도를 4로 나눈 나머지가 0, 연도를 100으로 나눈 나머지가 0이 아니거나 연도를 400으로 나눈 나머지가 0이면
//				int year = 2023;
//				if (year%4==0 && year%100!=0 || year%400==0) {
//					System.out.println("윤년");
//				}
//				else {
//					System.out.println("평년");
//				}
		//임의의 숫자 3개 입력받기
		//입력받은 3개의 숫자 중 가장 작은 수 출력하기
		System.out.printf("첫번째 수 입력 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.printf("두번째 수 입력 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.printf("세번째 수 입력 : ");
		int num3 = Integer.parseInt(sc.nextLine());
		
		// num1<num2 && num1<num3
		
		if(num1<num2 && num1<num3) {
			System.out.println("가장 작은 숫자는 :"+num1);
		}else if(num2<num1 && num2<num3) {
			System.out.println("가장 작은 숫자는 :"+num2);
		}else if(num3<num1 && num3<num2) {
			System.out.println("가장 작은 숫자는 : "+num3);
		}
		/////////////////////////////////////////////////////////
		int min=num1;
		if(min>num2) {
			min=num2;
		}
		if(min>num3) {
			min=num3;
		}
		System.out.println("가장 작은 수 "+min);
		
		int max = num1;
		if(max<num2) {
			max=num2;
		}
		if(max<num3) {
			max=num3;
		}		
		System.out.println("가장 큰 수"+max);
	
	}
	
		
}
