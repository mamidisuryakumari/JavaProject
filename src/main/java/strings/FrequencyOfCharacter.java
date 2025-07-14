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

	

	public void frequencyOfCharacters() {
	String sentense = "This is a mango tree";
	String name = sentense.toLowerCase().replace(" ", "");
	String output = "";
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
		output=ch[i]+String.valueOf(count);
		System.out.print(output);
		
		//	System.out.println("'" + ch[i] + "' appears " + count + " times");
		
		
		
	}
	
	}
	
	

	public static void main(String[] args) {

		FrequencyOfCharacter frequencyOfCharacter = new FrequencyOfCharacter();
		frequencyOfCharacter.frequencyOfCharacters();

	}

}
