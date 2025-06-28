package strings;

public class Split {
	
	public void split() {
		String message = "Order#12345:Success";
      String[] splitMsg = message.split(":");
      System.out.println(splitMsg.length);
      
      String path = "C:\\Users\\Test\\Report";
      String[] split = path.split("\\\\");
      System.out.println(split[0]);
      
      String name = "Surya Kumari";
      String[] nameCount = name.split(" ");
      System.out.println(nameCount.length);
      
      String fillMsg = "Transaction ID: TXN-98765 | Status: Completed";
      String[] parts = fillMsg.split("\\|");
      System.out.println(parts[0] + "status :"+  parts[1]);
      
      String part1 = parts[0];
      System.out.println(part1);
      String[] trasactionId = part1.split(":");
      String transaction = trasactionId[0];
      
      String[] splitTransaction = transaction.split(" ");
      String transaction1 = splitTransaction[0];
      
      System.out.println(transaction1);
      
      String part2 = parts[1];
      
      System.out.println(transaction1);
      
  //    String[] transaction = parts[]
      
      String messy = "   Hello     World   ";
     
      System.out.println( messy.replace(" ", ""));
      String cleaned = messy.trim().replaceAll("\\s+", " ");
System.out.println(cleaned);


	}
	
	public static void main(String[] args) {
		Split split = new Split();
		split.split();
	}

}
