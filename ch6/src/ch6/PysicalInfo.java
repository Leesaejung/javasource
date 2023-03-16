package ch6;

public class PysicalInfo {
	// 생성자 / 메소드 오버로딩
	// 오버로딩 : 한 클래스에 동일한 이름의 메소드, 생성자 존재
	
	String name;
	int age;
	float height;
	float weight;
	//생성자 오버로딩
	//생성자 이름은 같아야 함
	//매개변수의 개수 또는 타입이 달라야 함
	public PysicalInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public PysicalInfo(String name, int age, float height, float weight) {
//		super();
//		this.name = name;
//		this.age = age; 
		this(name,age); //생성자에서 다른 생성자 호출
		this.height = height;
		this.weight = weight;
		//this(height,weight); -> x this는 맨 첫번째만 쓸 수 있음
	}
	// 위 아래의 이름은 같지만 내부 타입의 순서가 다르기에 오류x 
	public PysicalInfo(int age, String name, float height, float weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}



	public PysicalInfo(float height, float weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	
	
	
}
