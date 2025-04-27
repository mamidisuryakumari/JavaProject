package Practise;

import java.util.Scanner;

public class CountAppend {
	
	
	public void countChar()
	{
		 StringBuilder result = new StringBuilder();
	        String uniqueCharacters = "abcdefghijklmnopqrstuvwxyz";
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Pease enter any word");
	        String actualWord = sc.next();

	        for (int i = 0; i < uniqueCharacters.length(); i++) {
	            char character = uniqueCharacters.charAt(i);
	            int count = 0; // Reset count for each character

	            for (int j = 0; j < actualWord.length(); j++) {
	                if (actualWord.charAt(j) == character) {
	                    count++;
	                }
	            }

	            if (count > 1) {
	                result.append(character).append(count);
	            }
	        }

	        System.out.println(result); // Example output: a1c1d1e1i2l1m1n1o2t1w1
	        
	        continueCheck();
	        
	}
	
	
	
	
	public void continueCheck()
	{
		System.out.println("Do you want to check another word.... Y / N");
    	try (Scanner scanner = new Scanner(System.in)) {
			String choice = scanner.next();
			
			if(choice.equalsIgnoreCase("y"))
			{
				countChar();
			}
			else {
				System.out.println("Terminated ....");
			}
		}
	}
    public static void main(String[] args) {

    	CountAppend append = new CountAppend();
    	append.countChar();
    	
    	
    }
}

