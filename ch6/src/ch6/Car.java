package ch6;
//main 클래스가 있어야 실행됨
public class Car {
	// 속성(property) ==> 멤버변수
	// 제조사, 모델, 최대 속도, 색상.........
	String company; //제조사
	String model; //모델
	String color; //색상
	int maxspeed;//최대 속도
	
	// 기능(function) ==> 메서드
	// 전진한다 후진한다............
	void forward() {
		System.out.println("전진한다.");
	}
	
	void backward() {
		System.out.println("후진한다.");
	}
	


}
