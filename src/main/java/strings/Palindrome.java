package strings;

public class Palindrome {
	
	public void palindrome() {
		String name = "madam";
		String  reverse = "";
		for(int i=name.length()-1; i>=0; i--) {
		char currentCharacter = name.charAt(i);
		reverse += currentCharacter;
		
		}
		if(reverse.equals(name)) {
			System.out.println("it is palindrome");
		}else
		System.out.println("It is not palindrome");
	}
	
	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		palindrome.palindrome();
	}

}
