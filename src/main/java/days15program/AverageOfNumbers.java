package days15program;

public class AverageOfNumbers {
	
	public void averageOfNumbers() {
		int[] numbers = {10,20,30,40,50};
		int sum = 0;
		int average = 0;
		for(int i=0 ;i<numbers.length;i++) {
		sum = sum + numbers[i];
		average = sum / numbers.length;
		}
		System.out.println(average);
	}
	
	
	
	public void average() {
		int a = 10;
		int b = 20;
		int sum;
		sum = a+b;
		int average = sum /2;
		System.out.println(average);
	}
	
	
	public static void main(String[] args) {
		AverageOfNumbers averageOfNumbers = new AverageOfNumbers();
		averageOfNumbers.averageOfNumbers();
	}

}
