package assignment4.ThreeStaticAbstractAndFinal;

public class Transaction {
private final double transactionFee=10.0;
	
	public final void performTransaction(Account account, String type, double amount) {
		System.out.println("\n-- Transaction Started---");
		if(type.equalsIgnoreCase("deposit")) {
			account.deposit(amount-transactionFee);
			System.out.println("Fee: ₹"+transactionFee+" deducted from deposit.");
		}else if(type.equalsIgnoreCase("withdraw")) {
			account.withdraw(amount+transactionFee);
			System.out.println("Fee: ₹"+transactionFee+" added to withdrawal.");
		}else {
			System.out.println("Invalid transaction type.");
		}
		System.out.println("Updated Balance: ₹"+account.getBalance());
		System.out.println("--- Transaction Complete ---\n");
	}	
	
	public double getTransactionFee() {
		return transactionFee;
	}
}
