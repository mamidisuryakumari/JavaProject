package InterviewP;

public class CompareTwoArrays {
	
	public static void main(String[] args) {
		int[] first = {1,2,3,4,5};
		int[] second = {3,4,5,6,7};

		
		for(int i=0; i<first.length;i++) {
			
			for(int j=0; j<second.length; j++) {
				
				if(first[i]==second[j]) {
					System.out.print(first[i]);
				}
			}
		}
		
		
	}

}
