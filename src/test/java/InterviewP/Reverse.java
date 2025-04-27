package InterviewP;

import java.util.Scanner;

public class Reverse {
	public void reverseString() {
		String name = "Surya";
		for (int i =4; i>=0; i--) {
			name.charAt(i);
			System.out.print(name.charAt(i));
		}
	}

	public void reverseString1() {
		String name = "Surya";
		for (int i =name.length()-1; i>=0; i--) {
			name.charAt(i);
			System.out.print(name.charAt(i));
		}
		}
	public void reverseString2() {
		String name = "Surya";
		StringBuilder stringBuilder = new StringBuilder(name);
		System.out.println(stringBuilder.reverse());
	}
	
	
	public void countString() {
		System.out.print("Enter a word: ");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		int wordCount = word.split(" ").length;
		
		System.out.println(wordCount);
	}
	
	 public void countString1() {
	        System.out.print("Enter a sentence: ");
	        Scanner scanner = new Scanner(System.in);
	        String sentence = scanner.nextLine();  // Read full line of text
	        int wordCount = sentence.trim().split("\\s+").length;

	        System.out.println("Word count: " + wordCount);
	    }

	public static void main(String[] args) {

		Reverse wordCount = new Reverse();
		wordCount.countString();

	}

}
