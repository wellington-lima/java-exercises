package exercise06;

public class Account {
	private String number;
	private String holder;
	private double balance;
	private double taxWithdraw = 5.00;
	
	public Account(String number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public Account(String number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public String getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double value) {
		balance += value;
	}
	
	public void withdrawal(double value) {
		balance -= value + taxWithdraw;
	}
	
	public double getTaxWithdraw() {
		return taxWithdraw;
	}

	public void setTaxWithdraw(double taxWithdraw) {
		this.taxWithdraw = taxWithdraw;
	}

	public String toString() {
		return "Account " + number + 
				", holder " + holder + 
				", Balance: $ " + String.format("%.2f", balance);
	}
}
