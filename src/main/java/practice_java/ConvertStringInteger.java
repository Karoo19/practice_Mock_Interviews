package practice_java;

public class ConvertStringInteger {

	public static void main(String[] args) {
		
		//convert integer to string
		
		String str="9";
		System.out.println(str);
		
		int num=Integer.parseInt(str);
		System.out.println(num);
		
		//int num=Integer.valueOf(str);
		
		//convert integer to string
		int a=12345;
		String st=Integer.toString(a);
		System.out.println(st.length());

	}

}
