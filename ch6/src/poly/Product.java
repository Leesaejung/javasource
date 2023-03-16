package poly;

public class Product {
	int price;
	int bounsPoint;
	
	public Product() {
		
	}
	
	public Product(int price) {
		super();
		this.price = price;
		bounsPoint = (int)(price/10.0); //보너스 점수는 제품 가격의 10%
		
	}
	
	
}
