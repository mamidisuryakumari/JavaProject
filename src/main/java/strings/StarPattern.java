package strings;

public class StarPattern {
	
	public void squarePattern(int n) {
		
		for(int i= 0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public void leftAlignedTriangle(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void rightTriangle(int n) {
	    for (int i = 1; i <= n; i++) {
	      
	        for (int j = i; j < n; j++) {
	            System.out.print("  ");
	        }
	       
	        for (int j = 1; j <= i; j++) {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
	
	public void invertedLeftAlignedTriangle(int n) {
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public void rightSidedTriangle(int n) {
		for(int i=0; i<=n; i++){
			for(int j=0; j<=i; j++) {
				System.out.print("  ");
			}
			for(int j=i; j<n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void pyramid(int n) {
		
		
		    for (int i = 1; i <= n; i++) {
		        for (int j = i; j < n; j++) {
		            System.out.print(" ");
		        }
		        for (int j = 1; j <= i; j++) {
		            System.out.print("* ");
		        }
		        System.out.println();
		    }
		}
		
	public void invertedPyramid(int n) {
	    for (int i = n; i >= 1; i--) {
	        // Print leading spaces
	        for (int j = 0; j < n - i; j++) {
	            System.out.print(" ");
	        }
	        // Print stars with space
	        for (int j = 1; j <= i; j++) {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
	
	
	public static void main(String[] args) {
		StarPattern starPattern = new StarPattern();
		starPattern.invertedPyramid(5);
	}

}
