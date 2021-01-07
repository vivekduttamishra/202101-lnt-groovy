package in.conceptarchitect.bankingapp

import in.conceptarchitect.finance.BankAccount

class Program {

	static void main(args) {
		// TODO Auto-generated method stub
		def password="pass"
		def amount=20000
		
		def a1=new BankAccount(	1, "Vivek","pass",20000)
	
		//testUsingPrint(a1)
		
		//test using assert
		
		
		
		a1.deposit(1000)
		assert a1.balance==21000
		
		//if assert is successful it has no visible output
		//NO NEWS IS A GOOD NEWS
		
		a1.deposit(-200)
		
		assert a1.balance==21000  //deposit should and balance should remain the same
		
		
		def currentBalance= a1.balance;
		
		
		a1.withdraw(-1,password)
		assert a1.balance==currentBalance
		
		a1.withdraw(currentBalance+1, password)
		assert a1.balance==currentBalance
		
		a1.withdraw(1, "wrong password")
		assert a1.balance==currentBalance
		
		a1.withdraw(1, password)
		assert a1.balance==currentBalance-1 
			
		println "All tests passed!"
	
	}

	private static testUsingPrint(BankAccount a1) {
		a1.deposit(1000)
		println "balance after deposit is $a1.balance"

		a1.deposit(-200)
		println "balance after deposit is $a1.balance"

		a1.creditInterest()
		println "balance after credit interest is $a1.balance"
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
