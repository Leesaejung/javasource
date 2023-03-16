package inheritance;

public class CheckingAccountEx {
	public static void main(String[] args) {
		CheckingAccount checkingAccount = new CheckingAccount("100-10", "홍길동", 1000000, "4444-5555");
		
		//카드번호 다를 때
		checkingAccount.pay("3333-5555", 50000);
		
		//카드번호 동일할 때, 잔액
		int balance = checkingAccount.pay("4444-5555", 50000);
		System.out.println("사용액 지불 후 잔액 "+balance);
	}

}
