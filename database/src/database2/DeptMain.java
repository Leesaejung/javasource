package database2;

import java.util.ArrayList;
import java.util.Scanner;

public class DeptMain {
	public static void main(String[] args) {
		DeptDao dao = new DeptDao();
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("======================");
			System.out.println("1. 특정부서 조회");
			System.out.println("2. 전체부서 조회");
			System.out.println("6. 종료");
			System.out.println("======================");
			
			System.out.print("메뉴 입력>>");
			int no = sc.nextInt();
			
			switch (no) {
			case 1:
				// 사용자로부터 조회흫 원하는 부서코드 입력받기
				System.out.print("부서코드 입력 >>");
				int deptno = sc.nextInt();
				//하나조회
				DeptDTO row = dao.getRow(deptno);
				// DeptDTO 출력
				System.out.println(row);
				break;
			case 2:
				//전체조회
				ArrayList<DeptDTO> list = dao.getRows();
				for(DeptDTO deptDTO : list) {
					System.out.println(deptDTO.getDeptno()+"\t");
					System.out.println(deptDTO.getDname()+"\t");
					System.out.println(deptDTO.getLoc()+"\t");
				}
				dao.getRows();
				break;
			case 6:
				flag = false;
				break;
			default:
				System.out.println("번호를 다시 입력해주세요");
				break;
			}
		}
		

	}

}
