
public class RemoveDuplicates {
	
	public static void reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            result.append(reversedWord.reverse()).append(" ");
        }

        System.out.println("Reversed Each Word: " + result.toString().trim());
    }

   
	
	
	public static void main(String[] args) {
		RemoveDuplicates removeDuplicates = new RemoveDuplicates();
		removeDuplicates.reverseEachWord("This ia a mango");
	}

}
