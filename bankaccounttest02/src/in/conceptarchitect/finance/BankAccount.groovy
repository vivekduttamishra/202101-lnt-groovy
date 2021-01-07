package in.conceptarchitect.finance

class BankAccount {

	private int accountNumber
	private String name
	private String password
	private double balance
	private double interestRate

	BankAccount(int accountNumber, String name, String password,
	double balance,double interestRate=12) {

		this.accountNumber=accountNumber
		this.name=name
		this.password=password
		this.balance=balance
		this.interestRate=interestRate
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}




	private String getPassword() {
		return password;
	}




	private void setPassword(String password) {
		this.password = password;
	}




	public double getInterestRate() {
		return interestRate;
	}




	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}




	public int getAccountNumber() {
		return accountNumber;
	}




	public double getBalance() {
		return balance;
	}




	def deposit(double amount) {
		balance+=amount
	}

	def withdraw(double amount, String password) {
		balance-=amount
	}

	def creditInterest() {
		balance+= balance*interestRate/1200
	}
}
