package Practise;

public class StringCount {

	public void Count() {
		String uniqueChar = "abcd";
		String characters = "aabbccddd";
		int count = 0;
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < uniqueChar.length(); i++) {
			char currentChar = uniqueChar.charAt(i);

			for (int j = 0; j < characters.length(); j++) {
				if (characters.charAt(j) == currentChar) {
					count++;
				}
			}

			if (count > 0) {
				result.append(currentChar).append(count);
			}
		}
		System.out.println(result);
	}
	
	public void compareArray() {
		int[] num1 = {1,2,5,4,6};
		int[] num2 = {2,4,6,7,8};
		
		for(int i=0;i<num1.length;i++) {
			for(int j=0;j<num2.length;j++) {
				if(num1[i]==num2[j]) {
					System.out.print(num1[i]);
				}
			}
		}
	}
	
	public void starPattern(int n) {
		for(int i =1; i<=n; i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
			
			
		}
	}

	public static void main(String[] args) {
		StringCount stringCount = new StringCount();
		stringCount.starPattern(4);
	}

}
