package shop;

import java.util.Scanner;

public class MyShop2 implements IShop{
	
	//쇼핑몰 이름
	private String title;
	//user 정보 저장 배열 선언
	User[] users = new User[2];
	Product[] products = new Product[4];
	Product[] carts=new Product[10];
	
	//선택된 user 저장
	private int selUser;
	
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		//User 2명 생성 후 배열에 저장
		 users[0] = new User("홍길동", PayType.CARD);
		 users[1] = new User("성춘향", PayType.CASH);
	}

	@Override
	public void genProduct() {
		//Product 4개(CellPhone 2개, SmartTv 2개)
		products[0] = new CellPhone("아이폰",1000000,"KT");
		products[1] = new CellPhone("갤럭시",900000,"SKT");
		products[2] = new SmartTv("엘지 TV",240000,"고해상도");
		products[3] = new SmartTv("삼성 TV",190000,"고해상도");
		
		
	}

	@Override
	public void start() {
		System.out.println(title + " : 메인화면 - 계정 선택");
		System.out.println("===========================");
		for(int i=0; i<users.length;i++) {	
			System.out.printf("[%d] %s(%s) \n",i,users[i].getName(),users[i].getPayType());}
			System.out.println("[x] 종료");
			System.out.println("선택 : ");
			String sel = sc.nextLine();
			System.out.println("## "+sel+" 선택 ##");
			
			//0번을 누르거나 1번을 누르면 productList() 호출
			//다른걸 입력 시 => 메뉴를 확인해주세요 메세지 출력
			switch (sel) {
			case "x": case "X":
				System.exit(0);
				break;
			case "0": case "1":
				selUser = Integer.parseInt(sel);
				productList();
				break;
			default:
				System.out.println("메뉴를 확인해주세요.\n");
				start();
				break;
			}
		}
	
	public void productList() {//상품목록 출력

		System.out.println();
		System.out.println(title+" 상품목록 - 상품 선택 ");
		System.out.println("===========================");
		
		//products 배열 출력
		
		for(int i=0; i<products.length;i++) {
		System.out.printf("[%d]",i);
		products[i].printDetail();
		products[i].printExtra();
		}
		System.out.println("[h] 메인 화면");
		System.out.println("[c] 체크 아웃");
		System.out.print("선택 : ");
		
		String sel = sc.nextLine();
		//상품 선택 시 0~3 => cart 제품 추가, productList() 호출
		//h-> start 메소드 호출, c > checkOut() 호출
		switch (sel) {
		case "0": case "1": case "2": case "3": 
			for (int i = 0; i < carts.length; i++) {
				if (carts[i] == null) {
					//Integer.parseInt("0") ==> 0
					carts[i] = products[Integer.parseInt(sel)];
					break;
				}
			}
			productList();
			break;
		case "h": case "H":
			start();
			break;
		case "c": case "C":
			checkOut();
			break;
		default:
			System.out.println("입력값을 확인해주세요.");
			break;
		}
	}

	public void checkOut() {
		System.out.println();
		System.out.println(title+" 체크아웃 ");
		System.out.println("===========================");
		
		//carts 출력
		int total = 0; //제품 가격 합계
		for (int i = 0; i < carts.length; i++) {
			if (carts[i]!=null) {
				System.out.printf("[%d] %s (%d) \n",i,carts[i].getName(),carts[i].getPrice());
				total += carts[i].getPrice();
			}	
		}
		System.out.println("===========================");
		System.out.println("결제 방법"+users[selUser].getPayType());
		System.out.println("결제 방법 : " +total);
		System.out.println("[p] 이전, [q] 결제 완료");
		System.out.print("선택 : ");
		String sel = sc.nextLine();
		
		
		// p일 때 productList()호출
		// q일 때 결제가 완료되었습니다. 프로그램 종료
		// 잘못 입력 시 checkOut() 호출
		switch (sel) {
		case "p":case "P":
			productList();
			break;
		case "q":case "Q":
			System.out.println("결제가 완료되었습니다.");
			System.exit(0);
			break;
		default:
			checkOut();
			break;
		}
		

	}
}