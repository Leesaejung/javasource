package ch4;

import java.util.Scanner;

public class WhileEx5 {

	public static void main(String[] args) {
		boolean run = true;
		int balance=0; //잔액 변수
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			
			System.out.println("----------------------------------");
			System.out.println("1. 예금, | 2. 출금 | 3. 잔액 | 4. 종료");
			System.out.println("----------------------------------");
			System.out.printf("메뉴 선택 >> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				// 예금액 입력받기
				// 잔액 = 잔액 + 예금액
				// 현재 잔액 출력
				System.out.print("얼마를 예금하시겠습니까? ");
				int credit = Integer.parseInt(sc.nextLine());
				balance = balance + credit;
				//balance += Integer.parseInt(sc.nextLine()); 윗줄과 같음
				System.out.printf("현재 잔액은 %d 입니다.\n",balance);
				break;
			case 2:
				System.out.print("얼마를 출금하시겠습니까? ");
				int withdr = Integer.parseInt(sc.nextLine());
				balance = balance - withdr;
				System.out.printf("현재 잔액은 %d 입니다.\n",balance);
				break;
			case 3:
				System.out.printf("현재 잔액은 %d 입니다.\n",balance);
				break;
			case 4:
				run = false;
				break;
			default:
				break;
			}
		}

	}

}
