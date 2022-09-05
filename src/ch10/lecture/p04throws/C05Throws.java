package ch10.lecture.p04throws;

import java.sql.SQLException;

import javax.sql.DataSource;

public class C05Throws {
	//throws를 사용하는게 좋은 습관은 아니래.
	static DataSource db = null;
	
	public static void main(String[] args) throws SQLException {
		m1();
	}
	private static void m1() throws SQLException {
		m2();
	}
	private static void m2() throws SQLException {
		m3();
	}
	private static void m3() throws SQLException  {
		db.getConnection();  //Unhandled exception type SQLException
	}
}
