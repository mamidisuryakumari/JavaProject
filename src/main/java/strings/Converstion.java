package strings;

public class Converstion {
	
	public void converstion() {
		String number = "123";
		int numbers = Integer.parseInt(number);
		System.out.println(numbers);
		
		
		int prise = 120;
		String prise1  = String.valueOf(prise);
		String prise2 = Integer.toString(prise);
		System.out.println(prise1);
		System.out.println(prise2);
		
		String str = "123.15";
		float f = Float.parseFloat(str);
		System.out.println(f);
		
		String totalPrise = "$55.00";
		float total = Float.parseFloat(totalPrise.replace("$", ""));
		System.out.println(total);
		
		String total1 = "$1234.5678";
		double grandTotal = Double.parseDouble(total1.replace("$", ""));
		System.out.println(grandTotal);
		
	}

	public static void main(String[] args) {
	  Converstion converstion = new Converstion();
	  converstion.converstion();
	}
}
