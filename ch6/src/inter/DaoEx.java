package inter;

public class DaoEx {

	public static void main(String[] args) {
		OracleDao oracle = new OracleDao();
		dbWork(oracle);
		
		Mysql mysql = new Mysql();
		dbWork(mysql);
	

	}
	
	static void dbWork(DataAccessObject dao) { //부모로 받으면 다향성 챙길 수 있음
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();

//		oracle.select();
//		oracle.insert();
//		oracle.update();
//		oracle.delete();
		
	}

}
