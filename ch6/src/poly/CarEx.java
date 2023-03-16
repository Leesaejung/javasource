package poly;

public class CarEx {

	public static void main(String[] args) {
//		Car car = new FireEngine();
//		Car car2 = new Ambulance();
		
		Car car = null;
		
		FireEngine fireEngine = new FireEngine();
		FireEngine fireEngine2 = null;
		
		fireEngine.water();
		car = fireEngine; //Car car = new FireEngine;
		
		fireEngine2 = (FireEngine) car; //강제 형변환
		fireEngine2.water();
		
		// java.lang.ClassCastException 자식이 왼쪽에 오고 부모가 오른쪽에 오는 것은 절대 불가능
//		FireEngine fe = (FireEngine) new Car();
//		fe.dirve();
		
		//자식 = 자식도 불가능
		//FireEngine fe = new Ambulance();
		
	}

}
