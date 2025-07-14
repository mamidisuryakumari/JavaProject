package Table;

public class Table {
	
	 public static void main(String[] args) {
	        String input = "abcdacdfg";
	        String output = "";
	        String checked = "";

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            // If already counted, skip
	            if (checked.indexOf(ch) != -1) {
	                continue;
	            }

	            int count = 0;

	            // Count how many times ch appears in input
	            for (int j = 0; j < input.length(); j++) {
	                if (input.charAt(j) == ch) {
	                    count++;
	                }
	            }

	        //    output += ch + String.valueOf(count); // Append character + count
	            System.out.println(ch + " appears " + count);
	            checked += ch; // Mark character as counted
	            
	           
	        }

	       
	    }
	
}