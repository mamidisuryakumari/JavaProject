package days15program;

import java.util.Scanner;

public class SumOfNumbers {

	public void sumOfNumbers() {
		int[] numbers = { 10, 20, 30, 40, 50 };
		int sum = 0;

		for (int i = 0; i <numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println(sum);
	}
	
	public void sum() {
		int a = 10;
		int b = 20;
		int c;
		c = a+b;
		System.out.println(c);
	}
	
	
	
	public void sumOfnNumbers() {
		System.out.println("Enter n numbers");
		Scanner scanner = new Scanner(System.in);
	  int n =	scanner.nextInt();
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		SumOfNumbers sumOfNumbers = new SumOfNumbers();
		sumOfNumbers.sumOfnNumbers();
	}

}
