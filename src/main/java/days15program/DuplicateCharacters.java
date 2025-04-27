package days15program;

public class DuplicateCharacters {

	public static void main(String[] args) {

		String text = "Programming for beginners";
		text = text.toLowerCase().replace(" ", "");

		for (int i = 0; i < text.length(); i++) {
			char currentCharacter = text.charAt(i);
			int count = 0;
			
			

			for (int j = 0; j < i; j++) {
				if (text.charAt(j) == currentCharacter) {
					count++;
				}
			}
			if (count > 0) {
				if(count >1)
				{
					break;
				}
				System.out.print(currentCharacter);
			}
			

		}

	}

}
