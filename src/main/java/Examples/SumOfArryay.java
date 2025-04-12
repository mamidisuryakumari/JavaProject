package Examples;

public class SumOfArryay {

	public static void main(String[] args) {
		int sum = 0;
		int totalSum = 0;

		int[] numbers = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < numbers.length; i++) {
			totalSum = sum += numbers[i];
		}
		System.out.println(totalSum);
	}

}
