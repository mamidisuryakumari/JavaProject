package strings;

public class ReverseString {
	
	public void reverseWithString() {
		String input  = "Automation Selinium".toLowerCase();
		
		
		String reverse =""; 
		
		for(int i=input.length()-1 ; i>=0; i--) {
			reverse += input.charAt(i);
			
		}
		
		System.out.println("Reverse String is " + reverse);
	}
	
	public void reverseWithStringBuilder() {
		String input  = "Automation";
	StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		System.out.println("Reverse string is " + sb);
	}
	
	public void reverseWithStringBuffer() {
		String input  = "Automation";
	StringBuffer sb = new StringBuffer(input);
		sb.reverse();
		System.out.println("Reverse string is " + sb);
	}
	
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		reverseString.reverseWithString();
	}

}
