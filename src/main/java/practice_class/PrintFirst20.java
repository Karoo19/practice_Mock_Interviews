package practice_class;

public class PrintFirst20 {

	public static void main(String[] args) {
		//WAP to print first 20 multiples of 10 and add the multiples
		//10, 20, 30,......................,200
		//10+20+30+....................+200 = ?  (sum)
		
		int i=1;
		int sum=0;
		while(i<=20) {
			System.out.println(i*10);
			sum=sum+(i*10);
			i++;
		}
		

	}

}
