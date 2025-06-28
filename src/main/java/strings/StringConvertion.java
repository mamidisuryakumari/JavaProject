package strings;

public class StringConvertion {
	
	public void stringConverToChar() {
		String str = "Test";
		char[] chars = str.toCharArray();

		System.out.println(str.toCharArray());
	//	String s = new String("abc");
		String s = "abc";
		System.out.println(s);
	}
	
	public void charToString() {
		char[] chars = {'T', 'e', 's', 't'};
		String name = new String(chars);
		System.out.println(name);

	}
	
	public void realTime() {
		String card = "1234567812345678";
		char[] chars = card.toCharArray();
		for(int i=0; i<chars.length-4 ; i++) {
			chars[i] = '*';
			
		}
		String masked = new String(chars);
		System.out.println(masked);

	}
	
	

public void example() {
	String input =" Hello W orld ";

	// trim()
	System.out.println(input.trim());  // May still leave Unicode spaces

	// strip()
	System.out.println(input.strip()); // Removes even Unicode whitespace

	// regex
	System.out.println(input.replaceAll("\\s+", "")); // Output: HelloWorld
	
	String message = "Order ID: @#12345";
	String id = message.replaceAll("[^0-9]", ""); 
	System.out.println(id);
	
	String input1 = "123456";
	boolean digits = input1.matches("[0-9]+");
	System.out.println(digits);
	
	String input2 = "HelloWorld";
	boolean characters = input2.matches("[a-zA-Z]+");
	System.out.println(characters);

	String input3 = "Hello123";
	boolean characters1 = input3.matches("[0-9a-zA-Z]+");
	System.out.println(characters1);
	
	String name = "123";
	int number = 123;

	System.out.println(name);
//	System.out.println(number.);
	
}
	
	public static void main(String[] args) {
		StringConvertion stringConvertion = new StringConvertion();
		stringConvertion.stringConverToChar();
		stringConvertion.charToString();
		stringConvertion.realTime();
		stringConvertion.example();
	}

}
