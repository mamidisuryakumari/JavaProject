package InterviewP;

public class Reverse {
	public void reverseString() {
		String name = "Surya";
		for (int i =4; i>=0; i--) {
			name.charAt(i);
			System.out.print(name.charAt(i));
		}
	}

	public void reverseString1() {
		String name = "Surya";
		for (int i =name.length()-1; i>=0; i--) {
			name.charAt(i);
			System.out.print(name.charAt(i));
		}
		}
	public void reverseString2() {
		String name = "Surya";
		StringBuilder stringBuilder = new StringBuilder(name);
		System.out.println(stringBuilder.reverse());
	}

	public static void main(String[] args) {

		Reverse wordCount = new Reverse();
		wordCount.reverseString2();

	}

}
