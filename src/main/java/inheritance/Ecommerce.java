package inheritance;

class Product{
	String productName ;
	int price;
	
	public void displayProduct() {
		System.out.println("Product Name: " + productName + " , Product price: " + price );
	}
	
}

class Electronics extends Product{

	int wareentyYears ;
	
	public void diaplayElectronics() {
		displayProduct();
		System.out.println("Warenty "+ wareentyYears + "years");
	}
	
}

public class Ecommerce {
	
	public static void main(String[] args) {
		Electronics e = new Electronics();
		e.productName = "SmartPhone";
		e.price = 1000;
		e.wareentyYears = 2;
		e.diaplayElectronics();
	}

}
