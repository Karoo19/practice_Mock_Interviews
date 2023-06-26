package practice_class;

public class ForLoop2 {

	public static void main(String[] args) {
		
		//use for loop to print first 20 multiples of 5 and add the multiples
		
		int sum=0;
		for(int i=1; i<=20; i++ ) {
			System.out.println(i*5);
			sum=sum+(i*5);
			i++;
			System.out.println("the sum of the iteration is "+sum);
			
		}
		System.out.println("the sum of the iteration is "+sum);

	}

}
