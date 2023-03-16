package ch5;

import java.util.Scanner;

public class ArrayEx10 {

	public static void main(String[] args) {
		//사용자에게 답변을 받을 수 있도록 코드 작성
		//답과 비교할 때 equals 써서  true인 경우 정답입니다. false인 경우 틀렸습니다. 정답은 ~~~ 입니다.
		String words[][]= {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("답을 쓰세요: ");
		System.out.println();
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d). %s의 뜻은?\n", i+1, words[i][0]);
			
			String ans = sc.nextLine();
			
			if (ans.equals(words[i][1])) {
				System.out.println("정답입니다.\n");
			}else {
				System.out.printf("틀렸습니다. 정답은 %s 입니다.\n",words[i][1]);
			}
		}

	}

}


//if (str.equals("abcde")) {
//	System.out.println("일치함");
//	} else {System.out.println("일치하지 않음");