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
public class IfEx2 {

	public static void main(String[] args) {
			
			int jumsu = 80;
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
				grade = 'E';
			}
			else { //0~49에 해당되는 점수는 이쪽으로 들어가서 결과가 나옴
				grade = 'F';
			}
			System.out.printf("점수 : %d 등급 : %c\n", jumsu, grade);

	}
}