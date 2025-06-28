import java.util.ArrayList;
import java.util.List;

public class CompareTwoLists {
	
	
	
	public List<String> allAccounts() {
		List<String> allAccounts = new ArrayList<> ();
		allAccounts.add("Ram");
		allAccounts.add("somu");
		allAccounts.add("bheem");
		allAccounts.add("abc");
		allAccounts.add("sdf");
		allAccounts.add("bheweem");
		System.out.println("Before accounts: " + allAccounts );
		return allAccounts;
	}
	
	public List<String> exestingAccounts() {
		List<String> exestingAccounts = new ArrayList<> ();
		exestingAccounts.add("Ram");
		exestingAccounts.add("somu");
		exestingAccounts.add("bheweem");
		System.out.println("Before exesting accounts: " + exestingAccounts );
		return exestingAccounts;
	}
	
	public String compareTwoAccounts() {
		List<String> approvedAccount = allAccounts();
		List<String> existingAccount = exestingAccounts();
		List<String> uniqueAccounts = new ArrayList<String>();
		String name = null;
		
		for(String accounts: approvedAccount) {
			if(!existingAccount.contains(accounts)) {
				uniqueAccounts.add(accounts);
				break;
				
			}
		
		}
		
		System.out.println("After exesting accounts :" + uniqueAccounts );
		
		return name;
	}
	
	public static void main(String args[]) {
	
	CompareTwoLists compareTwoLists = new CompareTwoLists();
		compareTwoLists.compareTwoAccounts();
		
	}
}
