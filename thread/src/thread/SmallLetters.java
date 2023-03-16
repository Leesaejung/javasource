package thread;

// Thread 작성 1. extends Thread 2. run 치고 오버라이딩
public class SmallLetters extends Thread {
	@Override
	public void run() {
		//같이 수행할 코드 작성
		//a~z까지 출력
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);
		}
	}
}
