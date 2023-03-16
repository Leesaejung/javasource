package inheritance;

public class ComputerEx {
	public static void main(String[] args) {
		Computer computer = new Computer();
		double result = computer.areaCircle(10);
		
		System.out.println("결과 : "+result);
		
		Calculater calculater = new Calculater();
		System.out.println(calculater.areaCircle(10));
	}

}
