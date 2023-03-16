package ch5;

public class ArrayEx3 {

	public static void main(String[] args) {
		// [] : 1차원 배열
		// [][]: 2차원 배열(행, 열)
		// int[] score;
		int score[]= {100, 88, 100, 100, 90};
		
		// 배열의 총합과 평균
		int sum=0;
		float everage=0f;
		
		for (int i = 0; i < score.length; i++) {
			sum+=score[i];	
		}
		// (float) 없었다면 478/5=>95.0, 몫만 나옴
		// 있었다면 478/5.0 => 95.6
		everage=sum/(float)score.length;
		
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+everage);
	}

}
