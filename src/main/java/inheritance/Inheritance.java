package inheritance;

class Vehicles {

	int wheels;

	public void start() {
		System.out.println("Vehicle is atarting");
	}
}

class Car extends Vehicles {
	String model;

	public void diaplayInfo() {

		System.out.println("Car model " + model);
		System.out.println("Number of car wheels " + wheels);
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.wheels = 4;
		myCar.model = "Benz";
		myCar.diaplayInfo();
		myCar.start();

	}
}
