import java.util.ArrayList;
import java.util.List;

public class Task1 {
	public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("asdad");
	list.add("123");
	list.add("a");
	list.add("5");
	list.add("ab");
	for(String n:list) {
		if(isNumeric(n)) {
			System.out.println(n);
		} 
		else {
			System.out.println("Not integer");
		}
		
	}
	}


public static boolean isNumeric(String strNum) {
    try {
        double d = Double.parseDouble(strNum);
    } catch (NumberFormatException | NullPointerException nfe) {
        return false;
    }
    return true;
}
}