package inheritance;

public class SmartTvEx1 extends Tv {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		
		//상속여부 확인
		stv.channel = 10;
		stv.channelUp();
		System.out.println("현재 채널 "+stv.channel);
		
		stv.power();
		System.out.println("전원 상태 "+stv.power);
		
		stv.displayCaption("Hello world"); //boolean caption;이 false여서 안 나옴
		stv.caption = true; //근데 이게 true로 바뀌어서
		stv.displayCaption("Hello world"); //hello world가 출력됨
	}

}
