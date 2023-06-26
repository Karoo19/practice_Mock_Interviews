package practice_java;

import java.util.Scanner;

public class TwoNumbersScanner {

	public static void main(String[] args) {
		// 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first number is: ");
		int FirstNumber = scanner.nextInt();
		System.out.println("Enter second number is ");
		int SecondNumber = scanner.nextInt();
		scanner.close();
		
		System.out.println("the sum of number is "+FirstNumber+ " and " + SecondNumber+ " is " +(FirstNumber+SecondNumber));
	    

	}

}
