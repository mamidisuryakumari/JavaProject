package days15program;

public class DuplicateElementsInArray {
	
	public void duplicateElements() {
		int[] array = {2,3,4,5,6,2,3};
		
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i] == array[j]) {
					System.out.println(array[i]);
				}
			}
			
		}
	}
	
	public void duplicateElements1() {
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {3,4,5,6,7};
		
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				if(array1[i] == array2[j]) {
					System.out.println(array1[i]);
				}
			}
		}
	}
	
	public void duplicateElements2() {
		
		String[] array1 = {"surya","kumari","sandhya","surya"};
		
		
		for(int i=0;i<array1.length;i++) {
			for(int j=i+1;j<array1.length;j++) {
				if(array1[i] == array1[j]) {
					System.out.println(array1[i]);
					break;
				}
			}
		}
	}
	
	public void duplicateElements3() {
		String[] array1 = {"surya","kumari","sandhya"};
		String[] array2 = {"kumari","sandhya"};
		
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				if(array1[i] == array2[j]) {
					System.out.println(array1[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		DuplicateElementsInArray duplicateElementsInArray = new DuplicateElementsInArray();
		duplicateElementsInArray.duplicateElements3();
	}

}
