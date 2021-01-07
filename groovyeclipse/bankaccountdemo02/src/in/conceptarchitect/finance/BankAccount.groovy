package in.conceptarchitect.finance

class BankAccount {
	
	int accountNumber
	String name
	String password
	double balance
	private double interestRate
	
	BankAccount(int accountNumber, String name, String password, 
				double balance,double interestRate=12) {
				
		this.accountNumber=accountNumber
		this.name=name
		this.password=password
		this.balance=balance
		this.interestRate=interestRate
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
