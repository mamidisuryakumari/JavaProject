package strings;

public class LettersCount {
	
	public void lettersCount() {
		String letters = "abcdacdfg";
		String checked ="";
		String output = "";
		 
		for(int i=0; i<letters.length(); i++) {
			char ch = letters.charAt(i);
			String str = ""+ch; 
		
		if(checked.contains(str)) {
			continue;
		}
		
	//	if(checked.indexOf(str) !=-1){
	//	    continue;
	//	}
			
			int count = 0;
			
			for(int j=0 ; j<letters.length();j++) {
				if(letters.charAt(j) == ch) {
					count++;
					
				}
			}
			
			
		//	output = ch+ String.valueOf(count);
		
		
		System.out.print(ch + " appear" + count);
		checked += ch;
		}
		
	}

	public static void main(String[] args) {
	LettersCount lc = new LettersCount();
	lc.lettersCount();

	}

}
