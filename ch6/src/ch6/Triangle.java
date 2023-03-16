package ch6;
/*
 * 클래스 구성요소의 순서는 상관 없음
 * 일반적으로 변수, 상수 => 생성자 => 메소드 순으로 작성
 */
public class Triangle {
	//삼각형 너비 구하기
	
	//속성
	//밑변, 높이 ==> 정수
	int baseline;
	int height;
	
	
	public Triangle(int baseline, int height) {
		super();
		this.baseline = baseline;
		this.height = height;
	}


	//기능
	//넓이 구하기
	//밑변*높이/2
	double getArea(){
		return baseline * height /2;
	}
}
