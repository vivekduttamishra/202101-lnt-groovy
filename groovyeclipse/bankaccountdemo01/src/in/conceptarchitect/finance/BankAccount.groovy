package in.conceptarchitect.finance

class BankAccount {
	
	int accountNumber
	String name
	String password
	double balance
	private double interestRate
	
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
