
public class StringVsStringBuilder {
	
	public static void  main(String[] args) {
		String s = "Welcome";
		s.concat("to java");
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("Welcome");
		sb.append("to java");
		System.out.println(sb);
		
		StringBuffer sbf = new StringBuffer("Welcome");
		sb.append("to java");
		System.out.println(sbf);
	}

	

}
