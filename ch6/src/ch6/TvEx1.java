package ch6;

public class TvEx1 {

	public static void main(String[] args) {
		//클래스로부터 객체를 만드는 과정 : 인스턴스화
		//Tv 객체 생성
		Tv tv = new Tv(); //클래스 이름 변수 이름 = new 클래스이름();
		//객체 선언 Tv tv;      객체 생성 tv = new Tv();
		
		//객체가 가지고 있는 속성, 메소드를 사용하기 위해서는 .(dot)로 접근
		print(tv); //주소 넘어감
		
		//멤버 변수 초기화
		tv.color = "black";
		tv.channel = 6;
		tv.power = true;
		
		//초기화 후 확인
		print(tv);
		
		tv.channelUp(); //메소드 호출 ==> 메소드 실행
		System.out.println("채널"+tv.channel);
		
		tv.power();
		System.out.println("전원여부"+tv.power);
		
		Tv tv2 = new Tv();
		tv2.color = "white";
		tv2.channel =11;
		//tv.power = true;
		
		//tv 켜기 tv 끄기
		tv2.power();
		print(tv2);
		
		
	}
	
	static void print(Tv tv) { //(타입 변수명), 타입 맞추는 거 중요함
		System.out.println("색상 "+tv.color);
		System.out.println("채널 "+tv.channel);
		System.out.println("전원여부 "+tv.power);
	}

}
