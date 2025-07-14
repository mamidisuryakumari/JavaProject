package strings;

public class RemoveDuplicatesString {
	
	public void removeDuplicates1() {
		String name ="suryakumari";
		
		String result ="";
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			String str = String.valueOf(ch);
			if(result.contains(str)) {
				continue;
	
			}
			
			result += ch;
		}
		
		System.out.println(result);
	}
	
	public void removeDuplicates2() {
		String name = "suryakumari";
		String result ="";
		
	for(int i=0; i< name.length(); i++) {
		char character = name.charAt(i);
		
	if(result.indexOf(character) == -1) {
		result += character;
		
	}
	
	
	
	}
	System.out.println(result);
	}

	public void removeDuplicates() {
		String name = "nagaraju";
		char[] ch = name.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			boolean isDuplicate = false;

			for (int j = 0; j < i; j++) {
				if (ch[i] == ch[j]) {
					isDuplicate = true;
					break;
				}
			}

			if (isDuplicate) {
				System.out.print(ch[i]);
			}
		}
	}

	public void removeDuplicatewithStringBuilder() {
		String name = "nagaraju";
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < name.length(); i++) {
			if ((result.toString().indexOf(name.charAt(i)) == -1)) {
				result.append(name.charAt(i));

			}
		}

		System.out.println(result);

	}

	public static void main(String[] args) {

		RemoveDuplicatesString rm = new RemoveDuplicatesString();
	
		rm.removeDuplicates1();
	}

}
