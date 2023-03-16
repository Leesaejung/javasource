package poly;

public class Buyer {
	int money = 1000;
	int bounusPoint = 0;
	
	//Product p = tv1;
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액 부족으로 물건을 구매할 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bounusPoint += p.bounsPoint;
		System.out.println(p + "을(를) 구매하셨습니다.");
	}
}
