package ch5;

import java.util.Arrays;

/*기본 타입 : byte, char, short, int, long, float, double, boolean
 *참조 타입 : String(클래스), 배열
 */

import java.util.Iterator;

public class ArrayEx2 {

	public static void main(String[] args) {
		int score[]=new int[5];
		
		for (int i = 0; i < score.length; i++) {
			score[i] = i*10;
		}
		
		System.out.println(score);
		System.out.println(Arrays.toString(score));
		
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		
		//향상된 for문
		System.out.println();
		for (int i:score) {
			System.out.println(i);
		}
		
		
		System.out.println();
		int iArr2[] = new int[10];
		//1~10사이의 임의의 숫자를 생성하여 배열에 저장
		
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10)+1;
		}
		System.out.println(Arrays.toString(iArr2));
		
		
		char cHarr[] = {'a','b','c','가','나'}; //char은 기본 타입 -> 바로 변환되서 문자 출력
		System.out.println(cHarr);
		
		String strArr[] = {"abc", "efg"}; //String은 참조 타입 -> 주소 출력
		System.out.println(strArr);
	}

}
