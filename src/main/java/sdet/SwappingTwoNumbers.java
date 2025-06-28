package sdet;

import java.util.Scanner;

public class SwappingTwoNumbers {
	
	public void enterKeyborad() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter name");
		int number = scanner.nextInt();
		System.out.println("You entered: " + number);
		scanner.close();
		
	}
	
	
	
	public static void main(String[] args) {
		
		SwappingTwoNumbers swappingTwoNumbers = new SwappingTwoNumbers();
	//	swappingTwoNumbers.enterKeyborad();
	//	swappingTwoNumbers.swappingTwoNumbers();
	}

}
