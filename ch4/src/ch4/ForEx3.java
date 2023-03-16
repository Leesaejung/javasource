package ch4;

import java.util.Scanner;

/* 반복문
 *  어떤 작업이 반복적으로 수행되도록 할 때 사용
 *  종류 : for(주로 사용), while, do~while
 */

public class ForEx3 {

	public static void main(String[] args) {
		//팩토리얼
		//팩토리얼할 숫자를 받기
		//4! = 4*3*2*1
		//팩토리얼 구한 후 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("출력을 원하는 팩토리얼 숫자 입력하세요 : ");
		int pac = Integer.parseInt(sc.nextLine());
		int sum = 1;
		for (int i = pac; i >= 1; i--) {
			sum = sum*i;
		}System.out.printf("%d의 팩토리얼의 값은 : %d 입니다\n", pac, sum);
	}

}
