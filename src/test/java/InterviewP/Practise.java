package InterviewP;

public class Practise {
	
public void frequencyOfCharacter() {
	String originalName  = "Surya Kumari Mamidi";
	String name = originalName.toLowerCase().replace(" ", "");
	
	char[] character = name.toCharArray();
	for(int i=0; i<character.length; i++) {
	char 	currentCharacter = character[i];
		int count = 1;
		
		for(int j=0; j<i+1; j++) {
			if(currentCharacter == character[j]) {
				count ++;
			}
		}
		
		System.out.println(currentCharacter + " occur "+ count + "times");
	}
}
	
	public static void main(String[] args) {
		Practise practise = new Practise();
		practise.frequencyOfCharacter();
	}

}
