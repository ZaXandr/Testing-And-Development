import java.util.Comparator;

public class Friend implements Comparable<Friend>  {
	public String Name;
	public String SurName;
	
	public Friend(String name,String surname) {
		 Name=name;
		 SurName=surname;
	}
	public String getName() {
		return this.Name;
	}
	public String getSurName() {
		return this.SurName;
	}
	public void Show() {
		System.out.print("("+Name+","+SurName+")");
	}
@Override
	public String toString() {
	return "("+SurName+","+Name+")";
}
@Override
	public int compareTo(Friend o) {
		if (this.getSurName().equals(o.getSurName())) {
			if((this.getName().compareTo(o.getName()))>0) {
				return 1;
			}else return -1;
		}
		if ((this.getSurName().compareTo(o.getSurName()))>0) {
			return 1;
		}else {
			return -1;
		}


		

}
}
