package InterviewP;

public class AnimalMethodOverriding {
	
	// Parent class
	
	    public void makeSound() {
	        System.out.println("Animal makes a sound");
	    
	}

	// Child class
	class Dog extends AnimalMethodOverriding {
	    @Override
	    public void makeSound() {
	        System.out.println("Dog barks");
	    }
	}

	// Another Child class
	class Cat extends AnimalMethodOverriding {
	    @Override
	    public void makeSound() {
	        System.out.println("Cat meows");
	    }
	}

	// Main class to test
	public static class TestAnimal {
	    public static void main(String[] args) {
	    	AnimalMethodOverriding myAnimal = new AnimalMethodOverriding();  // Calls parent method
	        myAnimal.makeSound();            // Output: Animal makes a sound

	    //    AnimalMethodOverriding myDog = new Dog();        // Calls overridden method
	   //     myDog.makeSound();               // Output: Dog barks

	   //     AnimalMethodOverriding myCat = new Cat();        // Calls overridden method
	   //     myCat.makeSound();               // Output: Cat meows
	    }
	}


}
