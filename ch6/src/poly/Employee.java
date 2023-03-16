package poly;

public class Employee {
	private String name;
	private String positon;
	
	public void work() {
		System.out.println(name+" "+positon+"이(가) 일한다");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPositon() {
		return positon;
	}

	public void setPositon(String positon) {
		this.positon = positon;
	}
	
	
}
