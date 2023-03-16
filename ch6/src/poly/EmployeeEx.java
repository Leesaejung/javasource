package poly;

public class EmployeeEx {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("홍길동");
		employee.setPositon("사원");
//		employee.work();
		workPrint(employee);
		
		//다형성 왼쪽(부모) 오른쪽(자식)
		//메소드가 오버라이딩 되었다면 오버라이딩된 메소드가 실행
		//오버라이딩 안 됬다면 위와 같이 부모 것을 씀
		Employee employee2 = new Ceo();
		employee2.setName("김동호");
		employee2.setPositon("CEO");
//		employee2.work();
		//Ceo.java의 work가 나옴
		workPrint(employee2);
		
		Employee employee3 = new Adminstrator();
		employee3.setName("정우성");
		employee3.setPositon("Admin");
//		employee3.work();
		//Adminstrator.java의 work가 나옴
		workPrint(employee3);
		
		Employee employee4 = new PartTime();
		employee4.setName("성춘향");
		employee4.setPositon("파트타임");
//		employee4.work();
		//PartTime.java의 work가 나옴
		workPrint(employee4);

	}
	
	//아래에 employee.work();를 몰아서 쓰고 싶다면
	static void workPrint(Employee employee) {
		employee.work();
	}

}
