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
public class IfEx1 {

	public static void main(String[] args) {
		// 조건 : true나 false 판별되어야함
		// i==0, i>0, i!=10...........
		/* 
		 * if (condition) {
			// 블럭실행여부는 조건이 true 일 때만 
			
		}
		*/
		
		int num = 0;
		
		//num이 0이라면 num=0출력하기
		if (num==0) {
			// true 일 때만 
			System.out.println("num=0");
		}
		//num이 0이 아니라면 num!=0출력하기
				if (num!=0) {
					// true 일 때만 
					System.out.println("num!=0");
				}
		
				// score가 60이상이면 합격 출력
				
				Scanner sc = new Scanner(System.in);
				System.out.printf("점수 입력 : ");
				int score = Integer.parseInt(sc.nextLine());
				if(score>=60) {
					System.out.println("합격");
				}
				else {
					System.out.println("불합격");
				}
				
//		if (condition) {
//			// true 일 때만 
//			
//		}else {
//			// false 일 때만
//		}
//	
//		if (condition) {
//			// true 일 때만 
//			
//		}else if(조건2){
//			// false 일 때만
//		}
//		else if(조건3){
//			// false 일 때만
//		}
				
			int jumsu = 70;
			char grade = ' '; //지역 변수는 사용하기 전에 무조건 초기화 하깅 , char -> 문자 하나
			if(jumsu >= 90) {
				grade = 'A';
			}
			else if(jumsu >= 80) {
				grade = 'B';
			}
			else if(jumsu >= 70) {
				grade = 'C';
			}
			else if(jumsu >= 60) {
				grade = 'D';
			}
			else if(jumsu >= 50) {
				grade = 'F';
			}
			System.out.printf("점수 : %d 등급 : %c\n", jumsu, grade);

	}
}