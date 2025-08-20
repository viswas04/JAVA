public class BankDemo {
	// Bank account variables
	String accountHolderName = "ABC";
	static int accountNumber = 123456;
	static long phoneNumber = 9876543210L;
	static int pinCode = 2345;
	double balance = 10000;
	double withdrawnAmount =2000;
	double addedAmount = 150;
	// Method to check balance
	void checkBalance() {
		System.out.println("Current Balance: " + balance);
	}
	// Method to withdraw money
	void withdraw(double amount) {
	    balance -= withdrawnAmount;
	    System.out.println("Withdrawn: " + withdrawnAmount);
	    System.out.println("Updated Balance: " + balance);
	}
	void addAmount(double amount) {
	    balance += addedAmount;
	    System.out.println("Deposited: " + addedAmount);
	    System.out.println("Updated Balance: " + balance);
	}
	// Method to display account details
	void displayAccountDetails() {
		System.out.println("Account Details");
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Account Number     : " + accountNumber);
		System.out.println("Phone Number       : " + phoneNumber);
		System.out.println("PIN Code           : " + pinCode);
		System.out.println("Previous Balance   : " + (balance + withdrawnAmount - addedAmount));
		System.out.println("Withdrawn Amount   : " + withdrawnAmount);
		System.out.println("Deposited Amount   : " + addedAmount);
		System.out.println("Updated Balance    : " + balance);
	}
	// Main method
	public static void main(String[] args) {
		BankDemo bank = new BankDemo();
		bank.checkBalance();
		bank.withdraw(2000);
		bank.addAmount(150);
		// Display final account details
		bank.displayAccountDetails();
	}
}