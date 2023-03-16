package inheritance;

public class CheckingAccount extends Account {
	
	
	private String cardNo; //체크카드 번호
	
	//은행 계좌  + 체크카드
	public CheckingAccount(String ano, String owner, int balance, String cardNo) {
		super(ano, owner, balance); //super(); => 부모 부르기
		this.cardNo = cardNo;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	
	//체크카드 사용액을 지불한다
	//카드번호, 사용액을 매개변수로 받아서 은행잔고보다 작은 경우 사용액을 지불
	//카드번호 일치하는지 확인
	
	//은행잔고보다 크거나 카드번호가 일치하지 않으면 지불 불가 메세지 출력
	
	//pay(cardNo, amount) : 잔액 리턴
	int pay(String cardNo, int amount) { //앞에 int여서 무조건 결과값이 int값으로 나와야함
	if(!this.cardNo.equals(cardNo)|| getBalance() < amount) {
			System.out.println("카드번호나 잔액을 확인해주세요.");
			return 0; //리턴의 의미 여기까지만 하고 돌아가라
		}
	// 잔액 = 잔액 - 사용금액
//	setBalance(getBalance()-amount);
//	return getBalance();
	//위의 두 줄을 한 줄로 바꿈
	//부모의 메소드 호출
	return withdraw(amount);
	//return super.withdraw(amount);   super. 을 붙여야 하는 경우도 있음
	}
}	
