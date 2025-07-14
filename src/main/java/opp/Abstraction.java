package opp;

abstract class Shape{
	
	 void color() {
		System.out.println("Coloring the shape");
	}
	
	abstract void draw() ;
		
	}

class Rectangle extends Shape{

	@Override
	void draw() {

System.out.println("Drawing a rectangle");
		
	}
	@Override
	void color() {

System.out.println("Coloring the rectangle with blue");
		
	}
	
	
}

public class Abstraction {
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.draw();
		rectangle.color();
	}

}
