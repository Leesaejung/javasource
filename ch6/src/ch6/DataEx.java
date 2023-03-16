package ch6;

public class DataEx {
	public static void main(String[] args) {
		//인스턴스 생성
		//참조형 타입 변수명 = new 참조형타입();
		Data d = new Data();
		d.x = 10;
		Data d2 =copy(d);//주소  d.x 값
		System.out.println("d.x = "+d.x);
		System.out.println("d2.x = "+d2.x);
		
	}
	
	//참조형 매개변수 : 값을 읽고 수정 가능
	static Data copy(Data d) { //메소드
		Data temp = new Data(); //객체(인스턴스) 생성
		
		temp.x = d.x;
		return temp;
	}


}
