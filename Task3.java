
public class Task3 {
	public static void main(String[] args) {

System.out.println(GetSum(16));
System.out.println(GetSum(942));
System.out.println(GetSum(132189));
System.out.println(GetSum(493193));

	
	}

public static int GetSum(int Num) {
	int result=Num;
	if(result<10) return result;
	else {
		int value=0;
	String s=String.valueOf(Num);
	char[] arr=s.toCharArray();
	for(int i=0;i<arr.length;i++) {
		value=value+Character.getNumericValue(arr[i]);
	}
	result=GetSum(value);
	}
	return result;
}

}