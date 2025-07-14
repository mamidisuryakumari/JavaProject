package strings;

public class CapitalizeFirstLetterWord {
	
	public void capitalizeWord() {
		String name = "This is a mango tree";
		String[] words = name.toLowerCase().split("\\s");
		
		StringBuilder result = new StringBuilder();
		
		for(String word: words) {
			result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
		}
		
		System.out.println(result);
	
	}
	
	

	public static void main(String[] args) {
		CapitalizeFirstLetterWord cflw = new CapitalizeFirstLetterWord();
		cflw.capitalizeWord();
		
	}

}
