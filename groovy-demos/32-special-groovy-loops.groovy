boolean isPrime(int number){

    if(number<2) return false;

    if(number==2) return true;

    if(number%2==0) return false;

    for(def x=3; x<=number/2; x+=2)
        if(number%x==0)
            return false;

    return true

}
//If I know  I have to loop for 5 times -->  for(int i=0;i<5;i++) doSomething() / for i in range(5)


5.times {println "Hello $it" }


50.upto(100){ 
    if(isPrime(it))
        print "$it\t"
}
println()

def sum=0
50.downto(0) {sum+=it}

println "sum is $sum"


//processing items of a list

def list=[2,3,9,18,4,17,13,11,4,41,43,27]


//print all primes from the list

list.each { 
    if (isPrime(it)) 
        print "$it\t" 
}

println()

//there is a findAll in the list
def primes= list.findAll{  isPrime(it) }

println primes


println primes.any{ it%2==0 }    //check if all values are odd

println primes.every{ it<50 }   //check all value in the list is less than 50





















