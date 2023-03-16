package ch5;
/*참조 타입에서 특정한 값이 할당되지 않은 상태 : null
 * 
 * 클래스 : char 배열에 기능을 추가한 개념
 * 
 */
public class ArrayEx7 {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		
		//int numArr[]=new int[3];
		String name[] =  new String[3];
		
		//System.out.println(name[0]); // 아무런 값을 할당하지 않았으니 결과값으로 null이 나옴
		
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		//초기화
		name[0] = "kim";
		name[0] = "park";
		name[0] = "Yi";
		
		System.out.println(name[0]);
		System.out.println(name[0].charAt(1));
		
		String str = "ABCDE";
		//            01234
		
		System.out.println(str.charAt(3)); //string만 str.~~~ 부를 수 있음
		System.out.println(str.charAt(4)); //string만 str.~~~ 부를 수 있음
		
		//문자열(String) 비교 == 을 사용하지 않음
		//equals(), equalsIgnoreCase()를 쓴다
		System.out.println(str.equals("abcde")); //대소문자 구별한다
		System.out.println(str.equalsIgnoreCase("abcde")); //대소문자를 무시한다
		
		System.out.println(str.equals("abcde")?"일치함":"일치하지 않음");
		
		if (str.equals("ABCDE")) {
			System.out.println("일치함");} 
		else {System.out.println("일치하지 않음");}
		
	}

}
