package exam;

public class Won2Dollor extends Converter{
	 

	@Override
	public double convert(double src) {
		// TODO Auto-generated method stub
		return src/1200;
}

	@Override
	public String getSrcString() {
		// TODO Auto-generated method stub
		return "원";
	}

	@Override
	public String getdestString() {
		// TODO Auto-generated method stub
		return "달러";
	}

 
}
