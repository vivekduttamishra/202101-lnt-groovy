package in.conceptarchitect.bankingapp

import in.conceptarchitect.finance.BankAccount

class Program {

	static void main(args) {
		// TODO Auto-generated method stub
		def a1=new BankAccount(	1, "Vivek","pass",20000)
		
		def a2=new BankAccount(2, 'Shivanshi', 'pass2', 25000, 13)
		
		a1.accountNumber=21
		
		
		show a1
		show a2
		
	}
	static def show(def account) {
		println """
Account Number	: $account.accountNumber
Name		: $account.name
Balance		: $account.balance
Interest Rate	: $account.interestRate

		"""
	}
}
