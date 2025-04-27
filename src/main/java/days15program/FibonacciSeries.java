package days15program;

public class FibonacciSeries {
	
	public void fibonacciSeries(int n) {
		int first = 0;
		int second = 1;
		for(int i=0; i<n; i++) {
		int	next = first + second;
		 System.out.print(first + " ");
		 first = second;
		 second = next;
		
		}
		
	}
	
	public static void main(String[] args) {
		FibonacciSeries fb = new FibonacciSeries();
		fb.fibonacciSeries(10);
	}

}
