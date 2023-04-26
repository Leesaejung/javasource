package action;

/*
 * 싱글톤 패턴
 * 
 * 싱글톤(Singleton) 패턴
 * 객체 생성하는 메소드가 여러번 호출되도 단 하나의 생성자가
 * 생성하는 객체가 리턴 => 객체는 하나만 생성
 */

public class ActionFactory {
	
	private static ActionFactory actionfactory;
	
	// 생성자
	private ActionFactory() {}
	
	public static ActionFactory getInstanse() {
		if(actionfactory == null) {
			actionfactory = new ActionFactory();
		}
		return actionfactory;
	}
	
	// Action 리턴 메소드(action) 다 끝나면 리턴
	Action action;
	public Action action(String cmd) {
		// 어디에서 요청이 왔는지
		if(cmd.equals("/insert.do")){
			action = new InsertAction();
		}else if(cmd.equals("/list.do")) {
			
		}else if(cmd.equals("/update.do")) {
			
		}else if(cmd.equals("/delete.do")) {
			action = new DeleteAction();
		}
		return action;
	}
}
