package inheritance;
/* 상속
 * 기존의 클래스를 재사용하여 새로운 클래스 작성
 * 상속 장점
 * 1)적은 양의 코드로 새로운 클래스를 작성할 수 있음
 * 2) 코드를 공통적으로 관리하기 때문에 추가 및 변경이 용이함
 * 
 * 상속은 extends로 표현
 * 
 * 상속 대상
 * 1) 자손 클래스는 조상 클래스의 모든 멤버를 상속받음(단, 생성자와 초기화 블럭은 상속 안됨)
 * 2) 자손 클래스의 멤버 개수는 조상 클래스보다 항상 같거나 많음
 */
public class Parent2 {
	String field1;
	
	public void method1() {
		System.out.println("Parent-method1()");
	}
	
	public void method2() {
		System.out.println("Parent-method2()");
	}

}

