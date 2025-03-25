package InterviewP;

public class LettersCount {
	
	public static void main(String[] args) {
		
		String chars = "aabbcccdd";
		String uniqueChars = "abcd";
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < uniqueChars.length(); i++) {
			char currentChar = uniqueChars.charAt(i);
			int count = 0; // Reset count for each character

			for (int j = 0; j < chars.length(); j++) {
				if (chars.charAt(j) == currentChar) {
					count++;
				}
			}
			
			// Append only if count > 0
			if (count > 0) {
				result.append(currentChar).append(count);
			}
		}

		// Print final result
		System.out.println(result);
	}
}

