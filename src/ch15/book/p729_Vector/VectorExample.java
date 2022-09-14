package ch15.book.p729_Vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> l =new Vector<>();
		l.add(new Board("t", "...", "w"));

		System.out.println(l);
	}
}
class Board{
	String subject;
	String content;
	String writer;
	
	Board(String subject, String content, String writer){
		this.subject=subject;
		this.content=content;
		this.writer= writer;
		
	}
}
