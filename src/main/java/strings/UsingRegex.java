package strings;

public class UsingRegex {
	
	public boolean isValidEmail(String email) {
		String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		return email.matches(regex);
	}
	
	public boolean isValidPhone(String phone) {
		String regex = "^[6-9]\\d{9}$";
		return phone.matches(regex);
	}
	
	public static void main(String[] args) {
		
		UsingRegex usingRegex = new UsingRegex();
		
		System.out.println(usingRegex.isValidEmail("kumari.mudila@gmail.com"));
		System.out.println(usingRegex.isValidPhone("0963563515"));
		
	}

}
