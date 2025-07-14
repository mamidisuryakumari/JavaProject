
public class FrequencyOfCharacters {
	
	public void frequencyOfCharacters() {
		String name = "suryakumari";
		char[] ch = name.toCharArray();
		boolean[] isVisted = new boolean[ch.length];
		
		for(int i=0; i<ch.length; i++) {
			if(isVisted[i]) {
				continue;
			}
			int count =1;
			
			for(int j=i+1 ;j<ch.length; j++) {
				if(ch[i] == ch[j]) {
					count ++;
					isVisted[j] = true;
				}
			}
			
			System.out.println(ch[i] + " appears " + count );
			
			
			
		}
	}
	
	public void duplicateCharacters() {
		String name = "suryakumari";
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<name.length(); i++) {
			if(result.toString().indexOf(name.charAt(i)) == -1) {
				result.append(name.charAt(i));
			}
		}
		
		System.out.println(result);
	}
	
	public void countLetters() {
		String name = "suryakumari";
		StringBuilder sb = new StringBuilder();
		boolean[] isVisted = new boolean[name.length()];
		
		for(int i=0; i<name.length(); i++) {
			
			if(isVisted[i]) {
			continue;
		
			}
			char currentChar = name.charAt(i);
			int count =1;
		for(int j=0; j<name.length(); j++) {
			if(name.charAt(j) == currentChar) {
				count++;
				isVisted[j] = true;
			}
			}
		sb.append(currentChar).append(count);
		}
		
		System.out.println(sb);
	}
	
	
	public static void main(String args[]) {
		FrequencyOfCharacters fs = new FrequencyOfCharacters();
		fs.countLetters();
		
	}

}
