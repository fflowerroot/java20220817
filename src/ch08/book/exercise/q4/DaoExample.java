package ch08.book.exercise.q4;
// DataAccessObject 들을 통해서 
public class DaoExample {
	public static void dbWork(DataAccessObjet dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}

//public interface DataAccessObjet{
//	//The public type DataAccessObjet must be defined in its own file
//}
class OracleDao implements DataAccessObjet {

	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
		
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB에 삽입");
		
	}

	@Override
	public void update() {
		System.out.println("Oracle DB를 수정");
		
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
		
	}
	
}


class MySqlDao implements DataAccessObjet {

	@Override
	public void select() {
		System.out.println("MySql DB에서 검색");
		
	}

	@Override
	public void insert() {
		System.out.println("MySql DB에 삽입");
		
	}

	@Override
	public void update() {
		System.out.println("MySql DB를 수정");
		
	}

	@Override
	public void delete() {
		System.out.println("MySql DB에서 삭제");
		
	}
}

