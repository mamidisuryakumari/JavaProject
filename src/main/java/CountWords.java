

public class CountWords {
	
	public void countWord() {
		String name = "Mamidi surya kumari";
		String[] countName = name.split(" ");
		int wordCount = countName.length;
		System.out.println(wordCount);
	}
	
	public void palindrome() {
		String name1 = "selenium";
		String rev = "";
		for(int i=name1.length()-1; i>=0 ; i--) {
			rev = rev+name1.charAt(i);
		}
		System.out.println(rev);
		if(name1.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}
		
		public void removeSpecialCharacter() {
			String s = "W#$%e_l))c1o_.m e";
			
	  String clean = s.replaceAll("[^a-zA-Z]", "");
	System.out.println(clean);
		}
	
		public void removeWhiteSpeces() {
			String s1 = "We l co me";
			String clean = s1.replace(" ", "");
			System.out.println(clean);
		}
		
		public void occurenceOfCharacters() {
			String letters = "aabbcdeeabcdef";
			 StringBuilder result = new StringBuilder();
			int count = 0;
			for(int i=0; i<letters.length() ; i++) {
			char character = letters.charAt(i);
				for( int j=0 ; j >letters.length(); j++) {
					if(character == letters.charAt(j)) {
						count ++;
					}
				}
				  if (count > 1) {
		                result.append(character).append(count);
		            }
			}
			 System.out.println(result);
		}
		public static void main(String[] agrs) {
			CountWords countWords = new CountWords();
		//	countWords.countWord();
		//	countWords.palindrome();
		//	countWords.removeSpecialCharacter();
			countWords.occurenceOfCharacters();
		}
	

}
