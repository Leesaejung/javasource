package ch2;

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

public class OperatorEx1 {

	public static void main(String[] args) {
		// ++, -- : 전위, 후위에 위치
		// 전위 : 값이 참조되기 전에 증가시킴 j = ++i;
		// 후위 : 값이 참조된 후에 증가시킴 j = i++;
		/*
		 * int i=5; i++; // i=i+1; 
		 * System.out.println(i);
		 * 
		 * i = 5; ++i; 
		 * System.out.println(i);
		 */
		
		int i = 5, j = 0;
		j=i++; // 우선 순위 1위) j = i; 2위) i=i+1;
		System.out.println("j=i++ 실행 후 i=" + i + " j="+j);
		
		i=5;
		j=0;
		j=++i; // 우선 순위 1위) i=i+1; 2위) j=i; 
		System.out.println("j=i++ 실행 후 i="+i+ " , j="+j);
		
		// ! : true ==> false, false ==> true
		// 피연산자가 boolean 값을 가질 때만 사용
		// !true, !false, !3(X)
		boolean play = true;
		System.out.println("play = "+play);
		System.out.println("!play = "+!play);
		
	}

}
