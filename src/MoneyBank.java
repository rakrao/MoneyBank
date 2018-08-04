//This code deals about creating bank details
public class MoneyBank {
	static int accountnumber;
	double accountbalance;
	String accountholdername;
	private double balance;

	public double getBalance() {
		return balance;
	} // getter and setter for balance

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public MoneyBank(int i, int j, Object name) {
		accountnumber = i;
		accountbalance = j; // constructor with parameters
		accountholdername = (String) name;

	}

	public double getAccountbalance() {
		return accountbalance; // getter and setter for account balance
	}

	public void setAccountbalance(double accountbalance) {
		this.accountbalance = accountbalance;
	}

	double withdraw(double withdrawamount) {
		if (accountbalance <= 0)
			return 0; // withdrawal function
		else
			return accountbalance = accountbalance - withdrawamount;
	}

	double deposit(double depositamount) {
		return accountbalance = accountbalance + depositamount; // deposit function
	}

	static int getNextAccountNumber(int accountnumber) {
		return accountnumber += 1; // getter for Next account number
	}
}
