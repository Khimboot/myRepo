package day7;

public class checkingAmount {

	int amount, balance;

	public void depot(double amount) {
		balance += amount;

	}

	public void withdraw(int amount) throws bankException {
		if (balance >= amount) {
			System.out.println("Withdraw: " + amount + " PHP");
			balance -= amount;
			System.out.println("Balance: " + balance + " PHP");
		} else {
			throw new bankException(amount);
		}
	}
}