package ch6;

import java.util.Scanner;

public class GoodsStockEx2 {

	public static void main(String[] args) {
		// 입력값으로 GoodsStock 인스턴스 생성
		
		Scanner sc = new Scanner(System.in);
		
		//입력
//		System.out.printf("상품코드 >> ");
//		String code = sc.nextLine();
//		System.out.printf("재고수량 >> ");
//		 int stockNum = Integer.parseInt(sc.nextLine());
//		 
//		//입력 값으로 인스천스 생성
//		GoodsStock goodsstock = new GoodsStock(code, stockNum);
//		//확인용
//		System.out.println(goodsstock);
		
		//3개의 상품에 대해서 인스턴스를 생성해야 한다면?
		//배열 객체부터 생성하기
		GoodsStock goods[] = new GoodsStock[3];
//		goods[0] = new GoodsStock("p001", 200);
//		goods[1] = new GoodsStock("p002", 150);
//		goods[2] = new GoodsStock("p003", 250);
//		위 세줄의 코드를 입력값으로 변경
		
		for (int i = 0; i < goods.length; i++) {
			System.out.printf("상품코드 >> ");
			String code = sc.nextLine();
			System.out.printf("재고수량 >> ");
			 int stockNum = Integer.parseInt(sc.nextLine());
			 goods[i] = new GoodsStock(code, stockNum);
			 System.out.println("-------------------------------------");
		}
		
		//확인용1
		for (int i = 0; i < goods.length; i++) {
			System.out.println(goods[i]);
		}
		//확인용1과 같지만 향상된 for문임
		for (GoodsStock goodsstock:goods) {
			System.out.println(goodsstock);
		}
	}

}
