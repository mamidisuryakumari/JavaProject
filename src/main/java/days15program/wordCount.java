package days15program;

import java.util.Scanner;

public class wordCount {
	
	public void wordCount() {
		System.out.println("Enter a word is: ");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		int wordCount = word.length();
		System.out.println("Word count is: " + wordCount);
		
	}
	
	public void sentenseCount() {
		System.out.println("Entar a sentense is: ");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		int wordCount = word.trim().split(" ").length;
		System.out.println("Word count is: " + wordCount);
		continueDo();
	}
	
	public void continueDo() {
		System.out.println("Do you want to check another sentense.... Y / N");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.next();
		if(choice.equalsIgnoreCase("y")) {
			sentenseCount();
		}
	}
	
	public void sentenseCount1() {
		String sentense = "I am surya";
		//int sentenseCount = sentense.trim().split(" ").length;
		String[] sentenseCount = sentense.trim().split(" ");
		
		
		System.out.println("Sentense count is:" + sentenseCount.length);
	}
	
	
	
	
public static void main(String[] args) {
		wordCount wordCount = new wordCount();
		wordCount.sentenseCount1();
		
		}
}
