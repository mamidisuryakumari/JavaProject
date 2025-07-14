package Encapsulation;

abstract class Animal{
	public void eat() {
		System.out.println("Dog eats food");
	}
	
	abstract void sound();
}

class Dog extends Animal{

	@Override
	void sound() {
		System.out.println("Dog barks bow bow");
		
	}
	
}

public class AbstractClass {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.sound();
	}

}
