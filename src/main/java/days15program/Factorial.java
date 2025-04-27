package days15program;

public class Factorial {
	
	public void factorial(int n) {
		
		long factorial = 1;
		for(int i=1; i<=n; i++) {
			factorial = factorial * i;
		}
		
		System.out.println("Factorial of 5 number is: "+factorial );
	}

	public static void main(String[] args) {
		
		Factorial factorial = new Factorial();
		factorial.factorial(5);

	}

}
