package days15program;

public class ReverseNumber {
	
	public void reverseNumber() {
		int number = 1234536;
		int reverse = 0;
		while(number!=0) {
			int digit = number % 10;
			reverse = reverse * 10 + digit;
		number =number/10;
		}
		System.out.println(reverse);
	}
	
	public static void main(String[] args) {
		ReverseNumber reverseNumber = new ReverseNumber();
		reverseNumber.reverseNumber();
	}

}
