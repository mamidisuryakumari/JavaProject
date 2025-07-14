package strings;

public class DuplicateCharacters {
	
	public void duplicateCharacters() {
String name = "aabbc";
String duplicate = "";
		
		for(int i=0; i< name.length(); i++) {
			char ch =  name.charAt(i);
			
			if(name.indexOf(ch) != name.lastIndexOf(ch) && duplicate.indexOf(ch) == -1) {
				duplicate += ch;
			}
			
		}
		System.out.println(duplicate);
		
	}
	
	public void duplicateCharacters1() {
		String name = "suryakumari";
		
		for(int i=0; i< name.length(); i++) {
			char character =  name.charAt(i);
			
			int count = 0;
			
			for(int j=0 ; j<i; j++) {
				if(name.charAt(j) == character) {
					count ++;
				}
			}
			
			if(count > 0) {
				if(count >1) {
					break;
				}
				System.out.print(character);
				
			}
				
				
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		DuplicateCharacters duplicateCharacters = new DuplicateCharacters();
		duplicateCharacters.duplicateCharacters();
	}

}
