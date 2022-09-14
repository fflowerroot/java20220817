package ch15.book.exercise.q7;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> l = dao.getBoardList();
		for (Board b : l) {
			System.out.println(b.getT() + "-" + b.getC());
		}
	}
}

class Board {
	private String t;
	private String c;

	public Board(String t, String c) {
		this.t = t;
		this.c = c;
	}

	String getT() {
		return t;
	}

	String getC() {
		return c;
	}
}

class BoardDao {

	public List<Board> getBoardList() {
		// TODO Auto-generated method stub
		List<Board> l = new ArrayList<>();
		l.add(new Board("title1", "content1"));
		l.add(new Board("title2", "content2"));
		l.add(new Board("title3", "content3"));
		return l;
	}

}