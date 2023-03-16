package ch5;

import java.util.Arrays;

public class ArrayEx6 {

	public static void main(String[] args) {
		// 로또번호
		int[] ball = new int[45];
		
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i+1;
		}
		System.out.println(Arrays.toString(ball));
		
		for (int i = 0; i < 6; i++) {
			// 0~44 사이의 임의의 값 구하기
			int n = (int)(Math.random()*45);
			int temp = ball[0]; //numArr[0] 의 값을 temp 변수에 담기
			ball[0] = ball[n]; 
			ball[n] = temp;
			}
		// 앞의 6자리 출력
		for (int i = 0; i < 6; i++) {
		System.out.print(ball[i]+ " ");
		}
	}

}
