package days15program;

import java.util.Scanner;

public class CheckEvenOrOdd {
	
	public void checkEvenNumberOrOddNumber() {
		int number = 7;
		
		if(number%2 == 0) {
			System.out.println("Number is even");
		}else {
		System.out.println("Number is odd");
		}
	}
	
	
	public void checkEvenNumberOrOddNumber1() {
		System.out.println("Enter a number:" );
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number %2 == 0) {
			System.out.println("Number is even");
		}else {
		System.out.println("Number is odd");
		}
	}
	
	public static void main(String[] args) {
		CheckEvenOrOdd checkEvenOrOdd = new CheckEvenOrOdd();
		checkEvenOrOdd.checkEvenNumberOrOddNumber1();
	}

}
