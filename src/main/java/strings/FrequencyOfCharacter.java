package strings;

public class FrequencyOfCharacter {

	public void frequencyOfCharacter() {

		String name = "Surya Kumari";
		char ch = 'u';
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (ch == name.charAt(i)) {
				count++;
			}
			
		}
		System.out.println(ch + " appear " + count);

	}

	public void frequencyOfCharacters1() {
		String name1 = "This is a mango tree";
		String name = name1.toLowerCase().replace(" ", "");

		// Convert to char array
		char[] chars = name.toCharArray();
		for (char c : chars) {
			System.out.print("'" + c + "' ");
		}

		// Track visited characters
		boolean[] visited = new boolean[chars.length];

		for (int i = 0; i < chars.length; i++) {
			if (visited[i]) {
				continue; // already counted this character
			}

			int count = 1;
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j]) {
					count++;
					visited[j] = true;
				}
			}

			System.out.println("'" + chars[i] + "' appears " + count + " times");
		}
	}

	public void frequencyOfCharacters() {
	String sentanse = "My name is Surya Kumari";
	String name = sentanse.toLowerCase().replace(" ", "");
	char[] ch = name.toCharArray();
	boolean[] visted = new boolean[ch.length];
	
	
	for(int i=0; i< name.length(); i++) {
		if(visted[i]) {
			continue;
		}
		int count =1;
		
		for(int j=i+1; j<name.length(); j++) {
			if(ch[i] == ch[j]) {
			count++;
			visted[j] = true;
		}
		}
		if(count>1) {
			System.out.println("'" + ch[i] + "' appears " + count + " times");
		}
		
		
	}
	
	}

	public static void main(String[] args) {

		FrequencyOfCharacter frequencyOfCharacter = new FrequencyOfCharacter();
		frequencyOfCharacter.frequencyOfCharacters();

	}

}
