package days15program;

public class SwapOfTwoNumbers {
	
	public void swapOfTwoNumbers() {
		int a = 10;
		int b= 20;
		int temp;
		
		 System.out.println("Before Swap: a = " + a + ", b = " + b);
		 
		 temp = a;
		 a= b;
		 b = temp;
		 
		 System.out.println("After Swap: a = " + a + ", b = " + b);
		
	}
	
	public static void main(String[] args) {
		SwapOfTwoNumbers swapOfTwoNumbers = new SwapOfTwoNumbers();
		swapOfTwoNumbers.swapOfTwoNumbers();
	}

}
