
public class Account {

	public static int numAccounts = 0;
	private static String phrase;

	public static void main(String[] args) {

		Account obj;

		obj = new Account("acct1");
		System.out.println("acct1");

		obj = new Account("acct2");
		System.out.println("acct2");

		obj = new Account("acct3");
		System.out.println("acct3");

		System.out.println();
		System.out.println("Accounts created: " + Account.getCount());
	}

	// Constructor Method for Account object
	public Account(String accountNumber) {
		phrase = accountNumber;
	}

	// Method for incrementing account instances
	public static int getNumAccounts() {
		phrase = str;
		numAccounts++;
	}

	public String toString() {
		return phrase;
	}

	// returns number of instance of this class created

	public static int getCount() {
		return numAccounts;

	}

}
