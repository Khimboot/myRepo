package day7;

public class bankException extends Throwable {
	private double amount;

	public bankException(double amount) {
		this.amount = amount;
	}
}