package modifier;

public class Account {
	// 속성(인스턴스 변수) -> private
	// 외부에서는 속성에 직접적으로 접근 불가
	// 인스턴스 변수의 값을 변경하고 or 얻어내고 싶다면 ==> 메소드로 처리(약속)
	private String ano;
	
	//getter / setter 메소드 활용
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	
}
