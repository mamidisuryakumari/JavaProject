package days15program;

public class ReverseString {
	
	public void reverseString() {
		String name = "Surya";
		StringBuilder sb = new StringBuilder(name);
	String 	reverse = sb.reverse().toString();
		System.out.println("Reverse string is: " + reverse);
		
	}
	
	
	public void reverseString1() {
		String name = "Surya";
		for(int i=name.length()-1; i>0; i--) {
			char reverse = name.charAt(i);
			
			System.out.print(reverse);
		}
	}
	
	public void reverseWordsOnly() {
	    String sentence = "Surya is a doctor";
	    String[] words = sentence.split(" ");
	    StringBuilder reversed = new StringBuilder();

	    for (int i = words.length - 1; i >= 0; i--) {
	        reversed.append(words[i]).append(" ");
	    }

	    System.out.println("Words Reversed: " + reversed.toString().trim());
	}

	
	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		rs.reverseWordsOnly();
	}
	
	
	
	

}
