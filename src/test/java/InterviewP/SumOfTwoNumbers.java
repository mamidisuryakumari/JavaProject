package InterviewP;

import java.util.Scanner;

public class SumOfTwoNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number");
		int num1= scanner.nextInt();
		System.out.print("Enter second number number");
		int num2 =scanner.nextInt();
		scanner.close();
		 int sum = num1 + num2; 
	        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
		
	}

}
