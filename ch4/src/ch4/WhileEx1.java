package ch4;

/* 반복문
 *  어떤 작업이 반복적으로 수행되도록 할 때 사용
 *  종류 : for(주로 사용), while, do~while
 */

public class WhileEx1 {

	public static void main(String[] args) {
		// 조건이 거짓이 될 때까지 계속 반복출력
//		System.out.println();
//		for (int i = 0; i < 10; i++) {
//			System.out.printf(i+ "  ");
		
		int i = 0;
		while (i<10) {
			System.out.print(i+ "  ");
			i++;
		}System.out.println();
			
		
		
	//		System.out.println();
	//		for (int i = 10; i >= 0; i--) {
	//			System.out.printf(i+ "  ");
	//		}
			
			i = 10;
			while (i>=10) {
				System.out.print(i+ "  ");
				i--;
			}System.out.println();
		
//		
//		//13579
//		System.out.println(); //i = i+2
//		for (int i = 1; i <= 10; i+=2) {
//			System.out.printf(i+ "  ");
//		}
		
		i = 1;
		while (i<=10) {
			System.out.print(i+ "  ");
			i+=2;
		}System.out.println();
//		
//		System.out.println();
//		for (int i = 0; i < 3; i++) {
//			System.out.println("Hello");
//		}
		
		i=0;
		while (i<3) {
			System.out.println("Hello");
			i++;
		}System.out.println();
//		
//		System.out.println();
//		for (int i = 1; i <=100; i+=2) {
//			System.out.printf(i+ "  ");
//		}
		
		i = 1;
		while (i<=100) {
			System.out.printf(i+ "  ");
			i+=2;
		}System.out.println();
//		
//		System.out.println();
//		int sum=0;
//		for (int i = 1; i <=10; i++) {
//			sum = sum + i;
//		
//		}System.out.println("1~10 까지의 합 : " + sum);
		
		int sum = 0;
		i = 1;
		while (i<=10) {
			sum = sum+i;
			i++;
			
		}
		System.out.println("1~10 까지의 합 : " + sum);
	}
}


