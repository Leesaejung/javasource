package inheritance;

//Math.random() : static 메소드
//Math.PI : final static double PI = 3.1415950000

public class Computer extends Calculater {
	@Override
	double areaCircle(double r) {
		System.out.println("Calculater 객체의 areaCircle 실행");
		return Math.PI * r * r;  //PI -> 대문자 호출은 상수, Math라는 클래스에 Static
		
	}
}
