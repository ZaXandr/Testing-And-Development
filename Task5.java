import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task5 {


	public static void main(String[] args) {

		String s="Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
		sort(s);
	}
	
	
	
	
		public static void sort(String s) {

			String[] FriendList=s.toUpperCase().split(";");
			Set<Friend> guests = new TreeSet<Friend>();
			  for (int i = 0; i < FriendList.length; i++)
			  {
			      String[] temp = FriendList[i].split(":");
			      guests.add(new Friend(temp[0], temp[1]));                 
			  }	  
			  for(Object o: guests) {
				 System.out.print(o);
			  }
			  
		
		}

}





/**/