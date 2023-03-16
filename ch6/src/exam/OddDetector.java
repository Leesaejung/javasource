package exam;

public abstract class OddDetector {
	private int n;
	
	public OddDetector (int n) {
		super();
    	this.n = n;
	}
	
	public int getN() {
		return n;
	}

	public abstract boolean isOdd(); //홀수이면 true 리턴

}
