package assignment4.ThreeStaticAbstractAndFinal;

public class Bank {
	private static int totalAccount=0;
	public static void incrementAccounts() {
		totalAccount++;
	}
	public static int getTotalAccounts() {
		return totalAccount;
	}
}
