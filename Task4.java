import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task4 {
	public static void main(String[] args) {
		int arr[]= {1,3,6,2,2,0,4,5};
		/*for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==5) {
					System.out.println("("+arr[i]+","+arr[j]+")");
				}
			}
		}*/
		IntStream.range(0,  arr.length)
	    .forEach(i -> IntStream.range(0,  arr.length)
	        .filter(j -> i != j && j>i && arr[i]+ arr[j]== 5)
	        .forEach(j -> System.out.println("("+arr[i]+","+arr[j]+")"))
	);
	}

}
