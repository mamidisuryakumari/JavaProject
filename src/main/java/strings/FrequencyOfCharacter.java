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

	public void frequencyOfCharacters(){
		String sentense = "This is  a mango tree";
		String name = sentense.toLowerCase().replace(" ","");
		String result ="";
		for(int i=0; i<name.length(); i++){
			char ch = name.charAt(i);
			String str = String.valueOf(ch);
			if(result.contains(str)){
				continue;
			}
			int count =0;
			for(int j=0; j<name.length(); j++){
				if(name.charAt(i) == name.charAt(j)){
					count++;
				}
			}
			System.out.println(ch + " Appears " + count);
			result += ch;
		}

	}



	public static void main(String[] args) {

		FrequencyOfCharacter frequencyOfCharacter = new FrequencyOfCharacter();
		frequencyOfCharacter.frequencyOfCharacters();

	}

}
