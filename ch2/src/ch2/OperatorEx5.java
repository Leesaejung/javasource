package ch2;

import java.util.Scanner;

/*연산자
 * 1) 단항연산자 -> +(양수), -(음수), ++, --, ~, !
 * 2) 이항연산자 ↓ 
 *    산술 : +, -, *, /, %, <<, >>, >>>
 *    비교 : >, <, >=, <=, ==(값이 같다면), !=(값이 같지 않다면)
 *    논리 : &&(and), &(and), ||(or), ^(xor), |(or)
 * 3) 삼항연산자 : ? :
 * 4) 대입연산자 : =  ex) a = 4;
 * 
 * 
 * 연산자 우선 순위
 * 
*/

public class OperatorEx5 {

	public static void main(String[] args) {
		/* 문제1
		 * 534자루의 연필을 30명의 학생에게 똑같은 개수로 나눌 때
		 * 학생은 한명당 몇개를 가질 수 있고, 연필의 나머지는 몇개인지 출력하기
		 * 출력) 학생 한명당 : 30
		 * 		남은 연필 수 : 5
		 * */
		int penc = 534;
		int stu = 30;
		
		System.out.println("학생 한명당 : "+(penc/stu));
		System.out.println("남은 연필 수 : "+(penc%stu));
				
		/*문제2
		 * 사다리꼴 너비 구하기
		 * 윗변 : 5, 아랫변 : 10, 높이 : 7인 사다리꼴 너비 구하기 (윗변아랫변)*높이/2
		 * 변수 사용, 소수 자릿수까지 출력
		 * */
		
		double sq = (double)(5+10)*7/2;
		System.out.println(sq);
		
		
		/*문제3
		 * 한달 월급을 10년 동안 저축할 때 최종 저축금액 구하기
		 * 조건 : 사용자로부터 한달 월급 구하기
		 * 출력예시 : 10년 저축금액 : 20000000
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.printf("월급 입력 : ");
		int month1 = Integer.parseInt(sc.nextLine());
		System.out.println("10년 저축금액 : "+ (month1*120));
		
		
		/*문제4
		 * 화씨 온도를 섭씨 온도로 변경하기
		 * 화씨 온도가 100일 때 섭씨 온도가 얼마인지 출력하기
		 * 섭씨 온도 = 5/9 * (화씨 온도-32)
		 * */
		
		int fahr = 100;
		
		double cels = 5/(double)9*(fahr-32);
		System.out.println("섭씨 온도 : " + cels);
		
		/*문제5 삼항연산자 이용(삼항연산자2개이용)
		 * int num=10일 때 num이 양수인지 음수인지 0인지 출력
		 * */
		
		int num = 10;
		String result = num > 0 ? "양수" : (num < 0 ? "음수":"0");
		System.out.println(result);
		
		/*문제6
		 * 숫자를 입력받아 짝수인지 홀수인지 출력하기
		 * */
		System.out.println("숫자를 입력해주세요 : ");
		int input = Integer.parseInt(sc.nextLine());
		result = input%2==0? "짝수":"홀수";
		System.out.println(result);
		
		
	}

}
