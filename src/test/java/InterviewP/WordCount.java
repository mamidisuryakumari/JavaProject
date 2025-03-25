package InterviewP;

public class WordCount {
	
	public void wordCount() {
		String name = "I am following bdd framework";
		int word = name.split(" ").length;

		System.out.println(word);
	}
	
	public void wordCount1() {
		String name = "I am following bdd framework";
		String[] words = name.trim().split("\\s+");
		int wordCount = words.length;

		System.out.println(wordCount);
	}
	public static void main(String args[]) {
		WordCount wordCount = new WordCount();
		wordCount.wordCount1();
	}

}
