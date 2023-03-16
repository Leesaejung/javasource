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
public class IfEx5 {

	public static void main(String[] args) {
		//중첩 if
//		if (condition) {
//			if (condition) {
//				
//			}else {
//				
//			}
//		}
//		else {
//			if (condition) {
//				
//			}else {
//				
//			}
//		}
		
		// 점수를 입력 받아서 점수가 90 이상이면 A 인데, 98이상이라면 A+, 94 미만이라면 A-
		// 점수를 입력 받아서 점수가 80 이상이면 B 인데, 88이상이라면 B+, 84 미만이라면 B-
		// 80 미만이라면 c
		Scanner sc =  new Scanner(System.in);
		
		System.out.printf("점수를 입력하세요 : ");
		char grade = ' ', opt = '0';
		int score = Integer.parseInt(sc.nextLine());
		if (score>=90) {
			if(score>=98) {
				grade = 'A';
				opt = '+';
			} else if (score<94) {
				opt = '-';
			}
		}else if (score>=80) {
			grade = 'B';
			if(score>=88) {
				opt = '+';
			} else if (score<84) {
				opt = '-';
			}
		}else {
			grade ='C';
		}
		System.out.printf("당신의 학점은 : %c%c",grade,opt );
	
	}
	
		
}
