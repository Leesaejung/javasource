package ch4;

import java.util.Scanner;

/* 중첩for문
 *  for문 안의 for문
 *  
 */

public class ForEx4 {

	public static void main(String[] args) {
		// 1.바깥 for int i = 1;
		// 2.i < 6;
		// 3.안쪽 for j=0
		// 4.j < 10;
		// 5.System.out.print("*"); 실행
		// 6.j++  j=1
		// 7.j<10;
		// 8.System.out.print("*"); 실행
		// 9.6번에서 8번 반복
		// 10.j가 10이되면 안쪽 for 종료
		// 11.System.out.println();
		// 12.바깥쪽 for i++실행 i=2
		// 13.i<6 조건 비교
		// 14.안쪽 for문 10번 수행
		// 15. 계속 되다가 i가 6이 되는 순간 for문 종료
		for (int i = 1; i < 6; i++){ 
			  for(int j = 0; j < 10; j++) {
			    System.out.print("*");
			  }
			  System.out.println();
			}
		
		//내려갈수록 늘어나는 별모양 찍기
		for (int i = 1; i <= 1; i++) {
			System.out.print("*");
		}System.out.println();
		for (int i = 1; i <= 2; i++) {
			System.out.print("*");
		}System.out.println();
		for (int i = 1; i <= 3; i++) {
			System.out.print("*");
		}System.out.println();
		System.out.println();
		
		for (int i = 0; i < 6; i++){ 
			  for(int j = 0; j <= i; j++) {
			    System.out.print("*");
			  }
			  System.out.println();
			}
		 System.out.println();
		
		 //4x+5y=60의 모든 해 구하기
		 //단 x,y는 10 이하의 자연수
		 //4*1+5*1=60
		 //4*1+5*2=60
		 //4*1+5*3=60
		 //4*1+5*4=60
		 //4*1+5*5=60
		 //4*1+5*6=60 .....
		 
		 //4*2+5*1=60
		 
		 for (int i = 1; i <= 10; i++){ 
			  for(int j = 1; j <= 10; j++) {
			    if (4*i+5*j==60) {
					System.out.printf("(%d, %d)\n",i,j);}	}  }
		 
		 for(int x = 1; x <= 10; x++) {
				for(int y = 1; y <= 10; y++) {
					if(4*x + 5*y == 60) { System.out.printf("(%d, %d)\n",x,y); } } }
		 
		 // break;
		 // 자신이 속해있는 가장 가까운 반복문에서 벗어나게 됨(주로 if와 같이 사용됨)
		 for (int i = 1; i <= 10; i++){ 
			 System.out.println(i);
			 if (i==5) break;
		 }System.out.println();
		 
		 //continue;
		 //반복문 내에서만 사용
		 //반복이 진행되는 도중에 continue 문을 만나면 반복문의 끝으로 이동하여 다음 반복으로 넘어감
		 for (int i = 1; i <= 10; i++){ 
			 if (i%3==0) continue;
			 System.out.println(i); //continue 써서 이 문장은 뛰어넘음
			 
		 }

	}
	
}