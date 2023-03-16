package exam;

public class IpTv extends ColorTv{
	
	private String Ip;
	
	public IpTv(int size, int resolution, String Ip) {
		super(size, resolution);
		this.Ip = Ip;
	}
	
	
	@Override
	public void printProperty() {
	      System.out.println("나의 IPTV는 "+super.getSize()+"인치, "+getResolution()+"컬러는, 주소는 "+Ip+" 입니다.");
	      super.printProperty();
	    //나의 IpTv는 32인치, 2048컬러, 주소는 192.0.0.2 입니다.
	   }

	
	

}
