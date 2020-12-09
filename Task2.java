import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task2 {
	public static void main(String[] args) {
	String txt1="alla";
	String txt2="STresS";
	first_none_repeating_letter(txt1);
	first_none_repeating_letter(txt2);
	}
	public static void first_none_repeating_letter(String s) {
		char[] text = s.toCharArray();
		for (int i=0;i<text.length-1;i++) {
			boolean flag=true;
			for(int j=0;j<text.length;j++ ) {
				if(Character.toLowerCase(text[j])==Character.toLowerCase(text[i]) && i!=j) {
					flag=false;break;
				}
			}
			if(flag) {
				System.out.println(text[i]);break;
			} else if(i==text.length-2) {
			System.out.println("None--");
			}
		}
	}
}



//   \\w*(\\w)(?=\\w*\\1)\\w*
	
	/*	for(int i=0; i<txt.length()-1;i++) {
	boolean flag = true;
	char temp = text[i];
	for(int j=i+1;j<txt.length();j++) {
		if (Character.toLowerCase(text[j])==Character.toLowerCase(temp)) {
		flag = false;
		}	
	}
	if(flag) {
		System.out.println(text[i]);break;
	} else  System.out.println("All symbol repeat");
}
}*/