public class BankAccount
{
	double balance;
	double w_amount;
	double d_amount;

	public BankAccount()
	{
		balance = 100;
	}

	public BankAccount(double bal)
	{
		balance = bal;
	}

	public void withdraw(double w_amount)
	{
		balance = balance - w_amount;
	}

	public void deposit(double d_amount)
	{
		balance = balance + d_amount;
	}

	public String toString()
	{
		return "The balance is " + balance;
	}

	public double setBalance(double setbal)
	{
		balance = setbal;
		return balance;
	}

	public double getBalance()
	{
		return balance;
	}
}