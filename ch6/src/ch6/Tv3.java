package ch6;
/* 
 * private -> 외부 접근 불가
 * 
 * 
 */
public class Tv3 {

	private String color; //색상
	private int channel; //채널
	private boolean power; //전원상태
	
	
	
	public Tv3() {
		super();

	}

	public Tv3(String color, int channel, boolean power) {
		super();
		this.color = color;
		this.channel = channel;
		this.power = power;
	}

	// 기능(function) ==> 메서드
	// 켜기, 끄기, 볼륨 높이기, 낮추기, 채널 변경............
	// void : 메소드 실행이 끝난 후 그냥 돌아감(리턴값 없음)
	void power() {
		power = !power;
	}
	
	// 채널을 증가하고 현재 채널을 리턴
	// int : 메소드가 실행이 끝난 후 int 값을 가지고 돌아감
	int channelUp() {
		channel++; //채널 증가
		return channel; //현재 채널을 리턴
	}
	
	void channelDown() {
		channel--;
	}
	
	
	//getter / setter 메소드
	//getter : 변수의 값을 리턴하는 형태
	public String getColor() {
		return color;
	}
	//setter : 변수의 값을 변경하는 형태
	public void setColor(String color) {
		this.color = color;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	
	
	
	
	
	

}
