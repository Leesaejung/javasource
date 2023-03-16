package ch4;

import java.util.Scanner;

/* 반복문
 *  어떤 작업이 반복적으로 수행되도록 할 때 사용
 *  종류 : for(주로 사용), while, do~while
 */

public class ForEx2 {

	public static void main(String[] args) {
		//주사위 5번 던지기
		//int dice = (int)(Math.random()*6)+1; // 1~6 사이의 임의의 수 만들기
		// System.out.println(dice);
		
		for (int i = 0; i < 5; i++) {
			int dice1 = (int)(Math.random()*6)+1;
			System.out.println(dice1);
		}
		
		//구구단 출력하기
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("5 * %d = %d\n",i,5*i);
			// 내가 쓴 것 : System.out.println("5 x "+i+ " = "+(5*i));
		}
		
		//출력을 원하는 단을 입력 받으세요
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("출력을 원하는 단을 입력하세요 : ");
		int dan = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		
		//3의 배수와 5의 배수의 합 구하기(단 1~100 사이의 숫자)
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if(i%3==0 || i%5==0) {
				sum = sum+i;
			}
		}System.out.printf("3과 5의의 배수의 합 = %d/n", sum);
		
		//3의 배수 합(9의 배수는 제외)
		// 변수 사용
		sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%3==0 && i%9!=0) {
				sum = sum+i;
			}	
		}System.out.printf("3의 배수의 합(9의 배수를 제외한) : %d\n", sum);
	}

}
