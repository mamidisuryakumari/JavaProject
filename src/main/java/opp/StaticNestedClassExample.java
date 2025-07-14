package opp;

class Outer{
	static String msg = "This is outer class";


static class Inner{
	public void diplay() {
		System.out.println(msg);
	}
}
}

public class StaticNestedClassExample {
	
	public static void main(String[] args) {
		Outer.Inner inner = new Outer.Inner();
		inner.diplay();
	}

}
