package days15program;

public class Numbers {
	
	public void evenNumber() {
		int n = 20;
		for(int i=1; i<n ;i++) {
			
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}
		public void oddNumber() {
			int n = 20;
			for(int i=1; i<n ;i++) {
				
				if(i%2 != 0) {
					System.out.println("Even numbers are" + i);
				}
			}
		
	}
		
		public void checkPrimeNumber() {
			int number =21;
			for(int i=2; i<number; i++) {
				if(number%i == 0) {
					System.out.println("Number " +number + " is not primenumber");
					return;
				}
			}
			System.out.println("Number " +number+" is primenumber");
		}
		
		 public void primeNumber() {
			
			        for (int i = 1; i <= 20; i++) {
			            boolean isPrime = true;

			            if (i <= 1) {
			                isPrime = false;
			            } else {
			                for (int j = 2; j < i; j++) {
			                    if (i % j == 0) {
			                        isPrime = false;
			                        break;
			                    }
			                }
			            }

			            if (isPrime) {
			                System.out.println("Number " + i + " is a prime number");
			            } else {
			                System.out.println("Number " + i + " is not a prime number");
			            }
		 }
		 }
	
	
	public static void main(String[] args) {
		Numbers primeNumbers = new Numbers();
		primeNumbers.primeNumber();
	}

}
