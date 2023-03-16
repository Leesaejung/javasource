package ch6;
//main 클래스가 있어야 실행됨
public class Car2 {
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
	
	//생성자
	//생성자의 이름은 클래스 이름과 동일해야 함
	//리턴값이 없음
	//생성자는 여러개 존재 가능(생성자 오버로딩)
	//목적 : 인스턴스가 생성될 때 호출됨
	//    : 인스턴스 초기화 담당(or 인스턴스 생성시 수행될 코드)
	
	// 기본 생성자
	public Car2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//매개 변수가 있는 생성자
	public Car2(String company, String model, String color, int maxspeed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}


	


}
