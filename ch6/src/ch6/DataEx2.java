package ch6;

public class DataEx2 {
	public static void main(String[] args) {
		Data data = new Data();
		
		//초기화
		data.x = 10;
		System.out.println("main() : x ="+data.x);	
		
		//값이 넘어감
		change(data.x); //change 호출
		System.out.println("After change(data.x)");
		System.out.println("main() : x ="+data.x);	
		
		//주소가 넘어감
		change2(data); //change2 호출
		System.out.println("After change2(data.x)");
		System.out.println("main() : x ="+data.x);	
	}
	//기본형 매개변수 : 값만 받게 됨
	//x가 가지고 있는 값만 받음
	static void change(int x) { //메소드
		x = 1000;
		System.out.println("change() : x = "+x);
	}
	
	//참조형 매개변수 : 값을 읽고 수정 가능
	static void change2(Data d) { //메소드
		d.x = 1000;
		System.out.println("change2() : x = "+d.x);
	}


}
