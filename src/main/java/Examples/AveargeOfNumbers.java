package Examples;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Scanner;

public class AveargeOfNumbers {

	public void averageOfNumbers() {
		int count;

		System.out.println("Enter count of numbers");
		Scanner scanner = new Scanner(System.in);
		count = scanner.nextInt();
		int number, sum = 0;
		float average;
		for (int i = 0; i < count; i++) {
			number = scanner.nextInt();
			sum = sum + number;
		}

		average = sum / count;
		System.out.println("Avearge of entered numbers" + average);
	}
	
	public void averageOfNumbers1() {
		int[] numbers = {10,20,30,40,50};
		int sum = 0;
		float average ;
		for(int i=0;i<numbers.length;i++) {
			sum = sum + numbers[i];
		}
		
		average = sum / numbers.length;
		System.out.println(average);
	}

	public static void main(String[] args) {
		
		AveargeOfNumbers aveargeOfNumbers = new AveargeOfNumbers();
		aveargeOfNumbers.averageOfNumbers1();
	}

}
