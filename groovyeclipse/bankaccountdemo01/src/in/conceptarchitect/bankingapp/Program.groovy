package in.conceptarchitect.bankingapp

import in.conceptarchitect.finance.BankAccount

class Program {

	static void main(args) {
		// TODO Auto-generated method stub
		def a1=new BankAccount(	name:"Vivek",interestRate:12);
		
		a1.deposit(10000)
		a1.withdraw(5000, 'mypassword')
		
		println "Account Name = $a1.name"
		
		println "Account Balance=$a1.balance"
		
		println "Interest Rate = $a1.interestRate"
		
	}
}
