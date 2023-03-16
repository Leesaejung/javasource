package ch6;

public class Student2{
	//학생이름 name 홍길동
	//반     ban  1
	//번호    no   1
	//국어점수 kor  78
	//영어점수 eng  78
	//수학점수 math  78
	//생성자
	String name; 
	int ban; 
	int no; 
	int kor; 
	int eng; 
	int math;
	
	
	public Student2(String name, int ban, int no) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
	}

	public Student2(String name, int ban, int no, int kor, int eng, int math) {
		this(name,ban,no);
//		this.name = name;
//		this.ban = ban;
//		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal(){
	//점수 총계
	int sum = 0;
	sum = kor+eng+math;
	return sum;
	}
	
	double getAverage(){
		//평균
		return getTotal()/3.0;
	}

	//source -> generate toString 주소--> 인스턴스 변수가 가지고 있는 값으로 출력
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}

	
//	String info(){
//		//국어+영어+수학
//		int sum = this.kor+this.eng+this.math;
//		double avg = (double)sum/3;
//		return this.name+","+this.ban+","+this.no+","+this.kor+","+this.eng+","+this.math+","+sum+","+avg;
//	}

	
	
}
