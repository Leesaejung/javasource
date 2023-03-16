package ch5;

import java.util.Iterator;

/* 배열(array)
 * 같은 타입의 여러 변수를 하나의 묶음으로 다루는 방법 
 *  int score = 98, score = 88 .............;
 *  
 *  ==> int score[]; // 배열을 선언
 *  ==> score = new int[30]; // 배열 생성
 */

public class ArrayEx1 {

	public static void main(String[] args) {
		// 연속된 공간에 int값을 저장할 수 있는 30개의 공간을 생성
		// index를 이용하여 접근할 수 있음
		// int 타입은 0으로 초기화 됨
		int score[] = new int[30];
		
		System.out.println(score[0]); // 0~29 인덱스로 접근
		System.out.println(score[15]); // 0~29 인덱스로 접근
		
		//새로운 값을 할당
		score[0]=98;
		score[1]=88;
		
		//배열 선언, 생성, 초기화
		//10명에 대한 점수를 배열로 다루기
		int score2[] = {98, 88, 76, 68, 50, 65, 45, 60, 69, 45};
		
		System.out.println("5번째 학생의 점수 "+score2[4]);
		
		
		double score3[] = {98.1, 88.7, 76.5, 68.1, 50.5, 65.4, 45.8, 60.2, 69.1, 45.6};
		for (int i = 0; i < score3.length; i++) {
			System.out.println((i+1)+"번째 학생 점수 : " +score3[i]);
		}
		
		//char 5개를 담는 배열
		char cHarr[] = {'a','b','c','d','e'};
		
		
		//byte, char, short, int, long, float, double, boolean = > 배열 타입 가능
		String strArr[] = {"abc", "efg"};
		
		
		// System.out.println(strArr[2]); strArr에는 0번 1번 밖에 없음

	}

}
