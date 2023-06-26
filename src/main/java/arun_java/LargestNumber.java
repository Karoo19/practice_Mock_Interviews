package arun_java;

public class LargestNumber {

	public static void main(String[] args) {
		
		int []a= {9,12,5,16,7,99,123,45};
		
		int max=0;
		for(int i=0; i<a.length; i++) {
			if(max<a[i]) {
				max=a[i];
			}
			
		}

		System.out.println("largest number is "+max);
	}

}
