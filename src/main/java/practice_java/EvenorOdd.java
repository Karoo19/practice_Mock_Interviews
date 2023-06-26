package practice_java;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first number is: ");
		int num = scanner.nextInt();
		scanner.close();
		
		//write logic and checking even or odd number:
		
		if(num%2==0) {
			System.out.println(num+"num given is even number");
			
		}else {
			System.out.println(num+"num given is odd number");
		}

	}

}
