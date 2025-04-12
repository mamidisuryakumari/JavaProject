package Examples;

import java.util.Scanner;

public class SumOfNumbers {
	
	
	    public static void main(String[] args) {
	        int count, numbers, sum = 0;

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the count of numbers: ");
	        count = scanner.nextInt();

	        for (int i = 0; i < count; i++) {
	            System.out.print("Enter a number: ");
	            numbers = scanner.nextInt();
	            sum = sum + numbers;  
	        }

	        System.out.println("The sum of the entered numbers is: " + sum);
	        
	        scanner.close(); 
	    }
	}


