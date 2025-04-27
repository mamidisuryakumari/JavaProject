package days15program;

public class Vowels {
	
	public void vowel() {
		String name = "Surya kumari";
	 String actualName = name.toLowerCase();
	 for(int i=0; i< actualName.length(); i++) {
		 char ch = actualName.charAt(i);
		 
		 if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			 System.out.print(ch);
		 }
	 }
	}
	
	public static void main(String[] args) {
		Vowels vowels = new Vowels();
		vowels.vowel();
	}

}
