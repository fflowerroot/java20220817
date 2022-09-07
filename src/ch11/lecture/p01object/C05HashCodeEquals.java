package ch11.lecture.p01object;

public class C05HashCodeEquals {
	
}
class Phone{
	private String mdelName;
	private int code;
	private String company;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((mdelName == null) ? 0 : mdelName.hashCode());
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
		Phone other = (Phone) obj;
		if (code != other.code)
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (mdelName == null) {
			if (other.mdelName != null)
				return false;
		} else if (!mdelName.equals(other.mdelName))
			return false;
		return true;
	}
}
