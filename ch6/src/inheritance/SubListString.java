package inheritance;

/* 오버로딩 : 하나의 클래스에 동일한 이름의 메소드(생성자)를 작성
 * ~ 메소드 오버로딩, 생성자 오버로딩
 * 
 * 오버라이딩 : 상속에서 추가된 개념, 
 *  -> 부모의 메소드와 동일한 시그니처(리턴 타입, 메소드명, 매개변수)를 가짐
 *  -> 부모가 제공해주는 기능 + 확장 / 새로운 기능을 정의
 */

public class SubListString extends ListString {
	String name = "성춘향";
	
	@Override
	public void list() {
		super.list(); //부모의 list도 호출 가능(홍길동) / list(); <- 자식 list만
		System.out.println(name + " 하위 클래스 이름");
	}
	
	private void writer() {
		System.out.println("하위 클래스 name 값 "+this.name);
		System.out.println("상위 클래스 name 값 "+super.name);
		//list() 호출 - SubListString, ListString
		list(); //this.list();와 같음
		super.list();
	}
	
}
