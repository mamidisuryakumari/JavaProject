package strings;

public class StringBuilderExample {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		String[] testCases = {"Login test", "Add to cart"};
		String[] status = {"Passed" , "Fail"};
		
		for(int i=0; i<testCases.length ; i++) {
			sb.append(testCases[i])
			.append( "-" ).append(status[i]).append("\n");
			
		}
		
		System.out.print(sb);
		
		System.out.println("apple".compareTo("banana"));
		System.out.println("abc".compareTo("abc"));
		System.out.println("zoo".compareTo("apple"));
			
	}

}
