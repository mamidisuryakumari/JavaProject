package strings;

public class UniqueCharacters {
	
	public void uniqueCharacters() {
		String name = "aabbcdac";
		String unique ="";
		
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			
			if(name.indexOf(ch) == name.lastIndexOf(ch)) {
				unique += ch;
			}
			
			
		}
		System.out.println("unique characters are" + unique );
		
	}

	public static void main(String[] args) {
		UniqueCharacters uc = new UniqueCharacters();
		uc.uniqueCharacters();
	}
}
