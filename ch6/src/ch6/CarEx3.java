package ch6;

public class CarEx3 {

	public static void main(String[] args) {
		//객체 생성 시 생성자가 자동으로 호출 됨
		//생성자 오버로딩을 통해서 초기값이 다양한 객체 생성
		Car3 car = new Car3(); //기본 생성자를 호출하면서 객체 생성
		Car3 car2 = new Car3("현대","쏘렌토","black");
		Car3 car3 = new Car3("현대","쏘렌토","black",2000);

	}

}
