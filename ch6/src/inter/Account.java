package inter;
/* 인터페이스
 *  추상화 클래스
 *  추상 클래스보다 추상화 정도가 높음 = > 일반 메서드, 멤버면수 가질 수 없음
 *  기본 설계도
 *  
 *  모든 멤버변수는 무조건 public, static, final(생략 가능)임
 *  모든 메소드는 public abstract
 *  단 static 메서드와 디폴트 메서드는 사용이 가능(jdk8버전부터 가능)
 */

public interface Account {
	//The blank final field y may not have been initialized
	 int x=0,y=0; //모든 멤버변수는 무조건 public, static, final(생략 가능)임 ==> 상수만 가짐
	// void stop() {} //Abstract methods do not specify a body -> 모든 메소드는 public abstract ==> 추상 메소드를 가짐
	 void stop();
	 
	 //단 static 메서드와 디폴트 메서드는 사용이 가능(jdk8버전부터 가능)
	 static void print() {}
	 default void add() {}
}
