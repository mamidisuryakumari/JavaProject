package Examples;

import java.util.Scanner;

public class AddDigitsOfNumber {
	
	public void addDigitOfNumber() {
		int number = 123;
		int sum = 0;
		while(number>0) {
			int lastDigit = number % 10;
			sum = sum + lastDigit;
			number = number /10;
			
		}
		
		System.out.println(sum);
				
	}
	
	
	public void addDigitOfNumber1() {
		System.out.println("enter number");
		Scanner scanner = new Scanner(System.in);
	int number	=scanner.nextInt();
	int sum = 0;
	while(number > 0) {
		
		int lastDigit = number % 10;
		sum = sum + lastDigit;
		number = number /10;
		
	}
	System.out.println(sum);
	
	}
	
	public static void main(String args[]) {
		AddDigitsOfNumber addDigitsOfNumber = new AddDigitsOfNumber();
		addDigitsOfNumber.addDigitOfNumber1();
	}

}
