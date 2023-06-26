package practice_class;

public class DecendingOrder {

	public static void main(String[] args) {
		
		// Print 11 multiples of 2 in descending order starting from 20
		// 20, 18, 16, 14, 12, 10, 8, 6, 4, 2, 0

		// print 11 multiples of 2
		// 2, 4, 6, 8,........, 22
		
		for(int i=20; i>=0; i=-2) {
			System.out.println(i);
			
		}
		System.out.println("*****************************************************************");
		
		for(int i=1; i<=11; i++) {
			System.out.println(i*2);
		}

	}

}
