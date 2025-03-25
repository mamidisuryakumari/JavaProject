package InterviewP;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int first = 0;
		int second =1;
		int n = 10;

		for(int i=0;i<n;i++) {
		int	next = first + second;
		System.out.print(first+" ");
		first = second;
		second = next;
		
		}
		
	}

}
