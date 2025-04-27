package days15program;

public class AddDigitsOfNumber {
	
	public void addDigitsOfNumber() {
		int number = 1234;
		int sum = 0;
		while(number!=0) {
			int digit = number%10;
			sum = digit +sum;
			number /= 10;
		}
		System.out.println(sum);
	}
	
	public static void main(String args[]) {
		AddDigitsOfNumber addDigitsOfNumber = new AddDigitsOfNumber();
		addDigitsOfNumber.addDigitsOfNumber();
	}

}
