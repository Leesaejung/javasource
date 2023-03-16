package ch6;

public class CalcEx2 {

	public static void main(String[] args) {
		// 사칙연산
		//클래스 사용 ==> 객체 생성
		Calc2 calc = new Calc2(); //기본생성자 씀
		
		System.out.println(calc.add(5, 3));
		
		System.out.println(calc.add(5, 3L));
		
		System.out.println(calc.add(5L, 3));
		
		System.out.println(calc.add(5, 3.0f));
		
		int num[] = {100, 200, 300, 400};
		System.out.println(calc.add(num));
		
	}

}
