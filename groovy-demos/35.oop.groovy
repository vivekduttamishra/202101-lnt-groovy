class BankAccount{
    final accountNumber
    String name

    BankAccount(accountNumber,name){
        this.name=name
        this.accountNumber=accountNumber
    }

    String toString(){  "BankAccount [ Account Number: $accountNumber\tName: $name]"}



}


def a1=new BankAccount(1, "Vivek")

println a1

//setter and getter is generated for name property
a1.setName("Vivek D Mishra")    
println a1.getName()

println "Account Number : ${a1.getAccountNumber()}"  //getter is generated for final property

a1.setAccountNumber(11) //setter is not generated for the final property