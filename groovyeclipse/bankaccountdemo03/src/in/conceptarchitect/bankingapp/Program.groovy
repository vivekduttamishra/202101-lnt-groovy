package in.conceptarchitect.bankingapp

import in.conceptarchitect.finance.BankAccount

class Program {

	static void main(args) {
		// TODO Auto-generated method stub
		def a1=new BankAccount(	1, "Vivek","pass",20000)
		
		
		a1.name="Vivek Dutta Mishra"		
		a1.interestRate=50 //should fail		
		show a1
		
		a1.setInterestRate(5) //should fail
		show a1
		
		a1.interestRate=13 //should pass
		show a1
		
		a1.deposit(500000)
		show a1
		
		println a1.getBalance()
		
	}
	static def show(def account) {
		println """
Account Number	: $account.accountNumber
Name		: $account.name
Balance		: $account.balance
Interest Rate	: $account.interestRate
Wealth Account	: $account.wealthAccount

"""
	}
}
