package InterviewP;

public class ReverseInt {
	  int numbers = 12345;
	  int reversed;
    public void reverseInt() {
      
    String str = Integer.toString(numbers);
   //     String str = String.valueOf(numbers);       
       for (int i = 4; i >= 0; i--) {
          System.out.print(str.charAt(i)); // Print characters in reverse order
      }

      
    }    
    
    public void reverseInt1() {
    	
    	 while (numbers != 0) {
             int digit = numbers % 10;  // Extract last digit
             reversed = reversed * 10 + digit;  // Build the reversed number
             numbers /= 10;  // Remove last digit
         }

         System.out.println("Reversed Number: " + reversed);
     }
    public static void main(String[] args) {
        ReverseInt reverseInt = new ReverseInt();
        reverseInt.reverseInt1();
    }
}
