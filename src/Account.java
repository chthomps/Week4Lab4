
public class Account {

	public static int numAccounts = 0;
	private static String accountNumber;

	public static void main(String[] args) {

		Account obj;

		obj = new Account("acct1");
		System.out.println("acct1");

		obj = new Account("acct2");
		System.out.println("acct2");

		obj = new Account("acct3");
		System.out.println("acct3");

		System.out.println();
		System.out.println("Accounts created: " + Account.getNumAccounts());
	}

	// Constructor Method for Account object
	public Account(String acct) {
		accountNumber = acct;
		numAccounts++;
	}

	// Method for incrementing account instances
	public static int getNumAccounts() {

		return numAccounts;
	}

}
