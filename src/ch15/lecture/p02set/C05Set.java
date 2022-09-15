package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class C05Set {
	public static void main(String[] args) {
		Set<C> s = new HashSet<C>();
		s.add(new C("americano"));
		
		
		
	}
}
class C{
	private String name;
	public C(String name) {
		// TODO Auto-generated constructor stub
		super();
		this.name=name;
	}
	@Override
	public String toString() {
		return "C [name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		C other = (C) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
