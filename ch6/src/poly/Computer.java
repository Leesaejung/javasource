package poly;

// 다형성(polymorphism) 여러가지 형태를 가질 수 있는 능력
					//상속일 때만 가능
//					하나의 참조변수로 여러 타입의 객체를 참조할 수 있는 것
//					조상 타입의 참조 변수로 자손 타입의 객체를 다룰 수 있는 것

//main 클래스가 있어야 실행됨
public class Computer extends Product{
	public Computer() {
		super(200);
	}

	@Override
	public String toString() {
		return "Computer";
	}
	
	
	
}
