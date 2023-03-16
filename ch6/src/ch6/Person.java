package ch6;


public class Person {
	String name;
	float height;
	float weight;
	
	
	
	void print() {
		System.out.println("이름 : "+name);
		System.out.println("키 : "+height);
		System.out.println("몸무게 : "+weight);
	}
	
	//name 매개변수의 값을 받아서
	//Person이 가지고 있는 name 인스턴스 변수의 값을 변경
	public void setName(String name) {
		//name이 공백이 아니고 null 아니면
		this.name = name;
		//String name에 있는 매개변수를 이용해서 name을 바꾸는데 쓰고 싶음
		//공백이거나 null이면 기본값을 홍길동
		if (name.equals("")||name==null) {
			this.name = "홍길동";
		}else {
			this.name = name;
		}
		print(); //같은 클래스 내부에 있기에 바로 쓸 수 있음
	}
		static void print2() {
			Person p = new Person();
			p.setName("");
		}
	
	
}
