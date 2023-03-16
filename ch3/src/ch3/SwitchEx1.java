package ch3;

public class SwitchEx1 {

	public static void main(String[] args) {
		// switch : if~else 대신 사용
//		switch (key) {
//		case value:
//			break;
//		case value:
//			break;
//		case value:
//			break;
//		default:
//			break;
//		}
		
		int month = 4;

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재 계절은 봄");
			break; // break;는 break가 해당되는 구역을 빠져나올 수 있게 도와줌
		case 6:
		case 7:
		case 8:
			System.out.println("현재 계절은 여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("현재 계절은 가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("현재 계절은 겨울");
			break;
		}
		
		if (month==3 || month==4 || month==5) {
			System.out.println("현재 계절은 봄");
		}else if (month==6 || month==7 || month==8) {
			System.out.println("현재 계절은 여름");
		}else if (month==9 || month==10 || month==11) {
			System.out.println("현재 계절은 가을");
		}else if (month==12 || month==1 || month==2) {
			System.out.println("현재 계절은 겨울");
		}
		
	}

}
