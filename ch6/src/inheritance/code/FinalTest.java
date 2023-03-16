package inheritance.code;

//(final이 클래스에 붙으면 )상속 금지
public final class FinalTest {
	
	final int MAX_SIZE=10; //상수
	
	final static int MIN_SIZE=0; //final static->공통(공유)으로 사용되는 상수
	
	//(final 붙으면)오버라이딩 금지
	final void getMaxsize() {
		final int LV = MAX_SIZE; //상수
		
	}
}
