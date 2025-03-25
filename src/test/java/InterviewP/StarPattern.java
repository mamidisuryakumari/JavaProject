package InterviewP;

	
	public class StarPattern {
		
		public void starPattern() {
	  
	        int n = 4; // Number of rows

	        for (int i = 1; i <= n; i++) {  // Loop for rows
	            for (int j = 1; j <= i; j++) { // Loop for columns
	                System.out.print("* ");
	            }
	            System.out.println(); // Move to the next line
	        }
	    }
		
		public void triangle() {
			 int n = 4; // Number of rows

		        for (int i = 1; i <= n; i++) {  
		            // Print spaces for right alignment
		            for (int j = i; j < n; j++) {
		                System.out.print(" ");
		            }
		            // Print stars
		            for (int k = 1; k <= i; k++) {
		                System.out.print("* ");
		            }
		            System.out.println(); // Move to the next line
		        }
		    }
		
	
	  public static void main(String[] args) {
	  StarPattern starPattern = new StarPattern();
	  starPattern.triangle();
	  }
	}


