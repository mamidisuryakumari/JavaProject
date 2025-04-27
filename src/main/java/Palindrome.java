
public class Palindrome {
	
	public void palindrome() {
		int reversed = 0;
		int number = 12345;
		int originalNumber = number;
		while(number!=0) {
			int digit = number %10;
			reversed = reversed * 10 + digit;
		number = 	number/10;
		}
		if(originalNumber == reversed) {
		System.out.println("Number is palindrome");
	}else {
		System.out.println("Number is not palindrome");
	}
	}
	
	public void palindrome1() {
		String name = "madama";
		String reverse = "";
		for(int i =name.length()-1;i>=0;i--) {
			 reverse = reverse + name.charAt(i);
			
		}
		if(name.equals(reverse)) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}
		
	}
	
	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		palindrome.palindrome1();
	}

}
