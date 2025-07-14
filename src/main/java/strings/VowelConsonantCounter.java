package strings;

public class VowelConsonantCounter {
	
	public void vowelConsonant() {
		
		String name = "suryakumari";
		int vowelCount = 0;
		int consonants = 0;
		
		for(int i=0; i<name.length(); i++) {
			
			char ch = name.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
				vowelCount ++;
			}else {
				consonants++;
			}
		}
		System.out.println("Vowel count is " + vowelCount);
		System.out.println("Consonant count is " + consonants);
	}
	
	public static void main(String[] args) {
		VowelConsonantCounter vowel = new VowelConsonantCounter();
		vowel.vowelConsonant();
	}

}
