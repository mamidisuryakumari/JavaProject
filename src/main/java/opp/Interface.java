package opp;

interface Animal{
	public void sound() ;
		void eat();
}

class Dog implements Animal{

	@Override
	public void sound() {
		System.out.println("Dog makes barking");
		}

	@Override
	public void eat() {
System.out.println("Dog eates biscutes");
		
	}
	
}
public class Interface {
public static void main(String[] args) {
	Animal dog = new Dog();
	dog.sound();
	dog.eat();

}
}
