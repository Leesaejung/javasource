package inheritance;

import inheritance.Parent.Child;

public class ChildEx {

	public static void main(String[] args) {
		Child2 child2 = new Child2();
		
		child2.method1(); //부모로부터 상속받은 거
		child2.method2(); //내꺼
		child2.method3(); //내꺼

	}

}
