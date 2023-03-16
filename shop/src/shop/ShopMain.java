package shop;

public class ShopMain {

	public static void main(String[] args) {
		
		IShop shop = new MyShop();
		
		// shop 이름 지정
		shop.setTitle("MyShop");
		//User 생성
		shop.genUser();
		//product 생성
		shop.genProduct();
		//shop 생성
		shop.start();
		
		
	}

}
