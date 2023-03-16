package ch4;

public class WhileEx4 {

	public static void main(String[] args) {
		// while, Math.random() 사용
		// 두개의 주사위를 던져 나오는 값을 (값1, 값2) 형태로 출력하고
		// 값의 합이 5가 아니면 계속 주사위를 던지고, 5인 경우 실행 종료
		
		
		int sum = 0;
		while (true) {
			int answer1 = (int)(Math.random()*6)+1;
			int answer2 = (int)(Math.random()*6)+1;
			System.out.println("("+answer1+","+answer2+")");
			//System.out.printf("(%d, %d)", answer1,answer2);
			sum = answer1+answer2;
			if (sum==5) break;
			
		}
		
		//for, if, while 수행할 문장이 하나라면 블럭을 생략할 수 있음
		//if(조건){ 수행할 문장 }
		
		
	}

}
