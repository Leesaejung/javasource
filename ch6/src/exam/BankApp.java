package exam;

import java.util.Scanner;
//private : 외부 클래스에서 호출 불가 => 내부에서만 사용하겠음
public class BankApp {
	//인스턴스 변수(초기화 완료)
	private static Account[] accountArray = new Account[10]; //Account 객체 배열 10개 선언, 생성
	private static Scanner scanner = new Scanner(System.in); //사용자 입력
	
	public static void main(String[] args) {
		boolean run = true;
		while(run){
			System.out.println("---------------------------------------------");
			System.out.println("1. 계좌생성 / 2. 계좌목록 / 3.예금 / 4.출금 / 5.종료");
			System.out.println("---------------------------------------------");
			System.out.println("선택 >>");
			
			// sc.next1line(); String 타입으로 입력값을 처리
			// scanner.nexrInt(); int 타입으로 입력값을 처리
			int selectNo = Integer.parseInt(scanner.nextLine()); //1 엔터
			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				whithdraw();
				break;
			case 5:
				//while 문 종료
				run = false;
				break;
			default:
				break;
			}
		}//while문 종료
	}//main 종료
	
	private static void createAccount() {
		//계좌 생성
		//Account 인스턴스를 생성하기 위한 입력 받기
		System.out.print("계좌번호>> ");
		String ano = scanner.nextLine();
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
		System.out.print("잔액: ");
		int balance = Integer.parseInt(scanner.nextLine());
		//for문을 돌려 i에 해당하는 배열 초기값이 null이면 수행
		//한번만 수행되고 빠져나오도록 해야 함
		for (int j = 0; j < accountArray.length; j++) {
			if (accountArray[j] == null) {
				accountArray[j] = new Account(ano, owner, balance);
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	private static void accountList() {
		//accountArray에 있는 내용 출력 ==> 생성된 계좌 출력
		System.out.println("계좌목록");
		System.out.println("---------------------------------------------");
		for (int j = 0; j < accountArray.length; j++) {
			if (accountArray[j] != null) {
				System.out.println(
						accountArray[j].getAno() + "  " + accountArray[j].getOwner() + "  " + accountArray[j].getBalance());
			}
			
		}
	}
	
	private static void deposit() {
		//예금하다 - 계좌번호, 예금액 입력받기
		//accountArray에서 일치하는 계좌를 찾아 잔액 = 잔액 + 예금액
		System.out.println("---------------------------------------------");
		System.out.println("예금");
		System.out.println("---------------------------------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		System.out.print("예금액: ");
		int amount = Integer.parseInt(scanner.nextLine());

		
		
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				if(accountArray[i].getAno().equals(ano)) {
					accountArray[i].setBalance(accountArray[i].getBalance()+amount);
					System.out.printf("현재 잔액은 : %d 입니다.\n",accountArray[i].getBalance());
				}
			
			}
		}
	}
	
	private static void whithdraw() {
		System.out.println("---------------------------------------------");
		System.out.println("출금");
		System.out.println("---------------------------------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		System.out.print("출금액: ");
		int withd = Integer.parseInt(scanner.nextLine());
		
		
		//accountArray[i]에서 일치하는 계좌(null이 아닌 계좌만)를 찾아 잔액 = 잔앧 - 출금액
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i]!=null) {
					if(accountArray[i].getAno().equals(ano)) {
						accountArray[i].setBalance(accountArray[i].getBalance()-withd);
						System.out.printf("현재 잔액은 : %d 입니다.\n",accountArray[i].getBalance());
			}
		}
			
	}
	

}

}
