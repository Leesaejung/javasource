package exam;

import java.util.Scanner;

public class CalculateEx {
	public static void main(String[] args) {
		
		int a, b;
        String op;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("a를 입력하시오>>");
        a = Integer.parseInt(sc.nextLine());
        System.out.print("b를 입력하시오>>");
        b = Integer.parseInt(sc.nextLine());
        System.out.print("연산자를 입력하시오>>");
        op = sc.nextLine();
        
        Calc calc = null;
        
        switch(op){
        case "+":
            calc = new Add();
            break;
        case "-":
        	calc = new Sub();
            break;
        case "*":
        	calc = new Mul();
            break;
        case "/":
        	calc = new Div();
            break;
        }
        calc.setValue(a, b);
        System.out.println("결과 "+calc.calculate());
    }

	

}
