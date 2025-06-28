package strings;

public class Substring {
	
	public void subString() {
	
	String successMsg = "Thank you! Your Order ID is #ORD98765.";
	
	int startIndex = successMsg.indexOf(" ");
			int endIndex = successMsg.indexOf("Y");
		String orderId = successMsg.substring(startIndex, endIndex);
		System.out.println("Order id is : "+ orderId);
	String order = successMsg.substring(successMsg.lastIndexOf("#") +1);
	
	System.out.println(order);
	
	String fileUrl = "https://app.com/downloads/invoice_20250625.pdf";
	String fileName = fileUrl.substring(fileUrl.lastIndexOf("/") + 1);
	
	System.out.println("File name is : "+ fileName);
	}	
		public static void main(String args[]) {
			Substring substring = new Substring();
			substring.subString();
		}

}
