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


	public String getName() { name }

	public void setName(String name) {
		this.name = name.toUpperCase()
	}
	
	public double getInterestRate() {interestRate}

	public def setInterestRate(double value) {
		double min=0.9*interestRate;
		double max=1.1*interestRate;
		if(value>0 && value>=min && value<=max)
			interestRate=value
			
	}


	boolean isWealthAccount() {
		balance>500000
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
