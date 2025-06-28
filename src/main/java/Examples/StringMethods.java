package Examples;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String name = "Surya Kumari ";
		String s1 = "Dhanya";
		String s2 = "Bhavya";
		// System.out.println(name.length());

		// System.out.println(name.replaceAll(" ", ""));
		System.out.println(name.replace(name.charAt(0), name.charAt(5)));

		// concat--joing strings

		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s2).concat(name));
		System.out.println(s1+s2.concat(name));
		
		String name1 = " Surya  ";
		System.out.println(name1.length());
		
		//trim -- remove spaces from left and right
		System.out.println(name1.trim());
		System.out.println(name1.trim().length());
		
		//chatAt()  returns  character from string based on index
		System.out.println(s1.charAt(0));
		
		//contains -- check the string is part of the main string
		System.out.println(name.contains("kumari"));
		System.out.println(name.contains("Surya"));
		
		//equals() , equalsIgnoreCase()--compare strings
		String s3 = "welcome";
		String s4 = "welcome";
		System.out.println(s3.equals("Welcome"));
		System.out.println(s3.equalsIgnoreCase("Welcome"));
		
		//replace() , replace single or multiple(sequence) characters in string
		String name2 = "Welcome to java and selenium and c";
		System.out.println(name2.replace('e', 'X'));
		System.out.println(name2.replace("and","end"));
		System.out.println(name2.replace('a', 'x').replace('e', 'z'));
		
		//subString()--extract substring from the main string 
		System.out.println(s3.substring(0,3));
		System.out.println(s3.substring(3));
		
		//Split--Sprint the string into multiple parts based on delimeter
		String s = "abc@gamil.com";
		String a[] =s.split("@");
		System.out.println(Arrays.toString(a));
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		//ex "abc,123@xyz"
		
		String n = "abc,123@xyz";
		String arr1[] = n.split(",");
		System.out.println(Arrays.toString(arr1));
		String arr2[] = n.split("@");
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
		String a1 = "abc 123";
		String arr[] = a1.split(" ");
		System.out.println(Arrays.toString(arr));
		
	}

}
