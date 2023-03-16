package ch4;

import java.util.Scanner;

/* 반복문
 *  어떤 작업이 반복적으로 수행되도록 할 때 사용
 *  종류 : for(주로 사용), while, do~while
 */

public class WhileEx3 {

	public static void main(String[] args) {
		// 사용자로부터 입력 받기
		// 숫자의 각 자리의 합 구하기
		// 12345 == 5+4+3+2+1
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("합을 구하고자 하는 숫자를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		int sum = 0;
		while (num!=0) {
			sum += num % 10;
			System.out.printf("sum=%-3d num=%d\n", sum, num);
			
			num = num/10;
		}System.out.println("각 자릿수의 합"+sum);
		
		
	}
}


