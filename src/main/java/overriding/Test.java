package overriding;

 class Animal {
    public void sound(){
        System.out.println(("Animals makes sound"));
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog makes bow bow sound");
    }
}

class Cat extends Animal{
    @Override
    public void sound() {
        System.out.println("Cat makes meow");
    }
}

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        Cat cat = new Cat();
        cat.sound();

    }
}
