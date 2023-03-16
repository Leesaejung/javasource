package ch6;

import java.util.Scanner;

public class CarEx4 {

	public static void main(String[] args) {
		//객체 생성 시 생성자가 자동으로 호출 됨
		//생성자 오버로딩을 통해서 초기값이 다양한 객체 생성
		Scanner sc = new Scanner(System.in);
		
//		//입력
//		System.out.printf("회사명 >> ");
//		String company = sc.nextLine();
//		System.out.printf("모델명 >> ");
//		String model = sc.nextLine();
//		System.out.printf("색상명 >> ");
//		String color = sc.nextLine();
//		System.out.printf("최대속도 >> ");
//		int maxSpeed = Integer.parseInt(sc.nextLine());
//		
//		//입력 값으로 인스천스 생성
//		Car3 car = new Car3(company, model, color, maxSpeed);
//		//확인용
//		System.out.println(car);
		
		//입력값으로 Car3 인스턴스 3개를 생성
		//배열 선언, 생성
		Car3 cars[] = new Car3[3];
		//초기화(입력값으로 해야 함)
		for (int i = 0; i < cars.length; i++) {
			System.out.printf("회사명 >> ");
			String company = sc.nextLine();
			System.out.printf("모델명 >> ");
			String model = sc.nextLine();
			System.out.printf("색상명 >> ");
			String color = sc.nextLine();
			System.out.printf("최대속도 >> ");
			int maxSpeed = Integer.parseInt(sc.nextLine());
			
			//입력값으로 인스턴스 생성
			cars[i] = new Car3(company, model, color, maxSpeed);
			System.out.println("-------------------------------------");
		}
		
		//확인용1
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		//확인용1과 같지만 향상된 for문임
		for (Car3 car:cars) {
			System.out.println(car);
		}
	}

}
