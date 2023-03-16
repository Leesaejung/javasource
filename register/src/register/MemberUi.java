package register;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberUi {
	public static void main(String[] args) {
		boolean isStop = false;
		Scanner sc = new Scanner(System.in);
		
		MemberConsolUtil util = new MemberConsolUtil();
		ArrayList<Member> list = new ArrayList<>(); //회원 정보를 담을 ㄱ갸채
		
		Member member = null; //선언, 생성x
		
		do {
			System.out.println("============회원관리 프로그램============");
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 목록 보기");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 프로그램 종료");
			System.out.println("============회원관리 프로그램============");
			
			System.out.println("메뉴변호>>");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				member = util.getNewMember(sc);
				//리턴값 member를 list에 추가
				list.add(member);
				util.printAddSuccessMessage(member);
				break;
			case 2:
				util.printMemberList(list);
				break;
			case 3:
				member = util.updateMember(sc, list);
				
				if (member!=null) {
					util.printUpdateSuccessMessage(member);
				}else {
					util.printUpdateFailMessage();
				}
				
				break;
			case 4:
				util.removeMember(sc, list);
				if (member!=null) {
					util.printRemoveSuccessMessage(member);
				}else {
					util.printRemoveFailMessage();
				}
				break;
			case 5:
				isStop = true;
				break;

				

			default:
				break;
			}
		} while (!isStop);

	}
	

}
