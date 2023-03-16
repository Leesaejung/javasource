package ch6;

public class Student{
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
	
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	


	String info(){
		//국어+영어+수학
		int sum = this.kor+this.eng+this.math;
		double avg = (double)sum/3;
		return this.name+","+this.ban+","+this.no+","+this.kor+","+this.eng+","+this.math+","+sum+","+avg;
	}




	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}
	//toString -> 세팅된 값을 뽑아주세요
	
	
}
