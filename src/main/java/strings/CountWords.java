package strings;

public class CountWords {
	
	public void countWords() {
		String sentense = "This is a apple tree";
		
		String[] word = sentense.split("\\s");
		int wordCount = word.length;
		System.out.println(wordCount);
	}
	
	public static void main(String[] args) {
		CountWords countWords = new CountWords();
		countWords.countWords();
	}

}
