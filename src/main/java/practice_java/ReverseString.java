package practice_java;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="karima";
		char[]a=str.toCharArray();
		int size=a.length;
		String reverseString="";
		for(int i=size-1; i>=0; i--) {
			reverseString=reverseString+a[i];
		}

		System.out.println(reverseString);
	}

}
