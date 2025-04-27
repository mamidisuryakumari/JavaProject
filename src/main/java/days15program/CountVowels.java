package days15program;

public class CountVowels {
	
	public void countVowles() {
		String name = "Surya Kumari Mamidi";
	String actualname	= name.toLowerCase();
	int vowelCount = 0;
	
	for(int i =0; i<actualname.length(); i++) {
		char currentCharacter = actualname.charAt(i);
		if(currentCharacter == 'a' || currentCharacter == 'e' || currentCharacter == 'i' || currentCharacter == 'o' || currentCharacter == 'u' ) {
			vowelCount ++;
		}
	}
	System.out.println("Vowel count is: "+vowelCount );
	}
	
	public static void main(String[] args) {
		CountVowels countVowels = new CountVowels();
		countVowels.countVowles();
	}

}
