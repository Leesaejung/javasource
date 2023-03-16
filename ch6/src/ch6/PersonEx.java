package ch6;

public class PersonEx {

	public static void main(String[] args) {
		//Person 인스턴스 생성=>Person이 가지고 있는 인스턴스 변수, 메소드 사용 가능
		Person p = new Person(); //이제부터 Person() 내용물을 쓰겟다
		p.setName("");
		p.print();
		
		Person.print2();
	}

}
