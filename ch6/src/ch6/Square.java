package ch6;

public class Square {
	//정사각형의 넓이 구하기
	
		//속성
		//밑변, 높이 ==> 정수
		int line;
		


		//기능
		//넓이 구하기
		//변*2
		public Square(int line) {
			super();
			this.line = line;
		}



		int getArea(){
			return line*line;
		}
}