





boolean isPrime(int number){

    if(number<2) return false;

    if(number==2) return true;

    if(number%2==0) return false;

    for(def x=3; x<=number/2; x+=2)
        if(number%x==0)
            return false;

    return true

}



assert isPrime(2)
assert isPrime(19)
assert !isPrime(-4)
assert !isPrime(63)
assert !isPrime(4)


def search(def list, def isMatch){

    def result=[]
    for(def value in list)
        if (isMatch(value))
            result<< value    //result.add(value)

    return result
}


def list=[2,3,11,20,18,4,14,19,21,23,70,61,45, 70, 97,11,18]


def evens=  search(  list, { number -> number%2==0      }    )


def f5=   search(list, { it%5==0 })


println f5


println  search(1..100) {it>70 && it%7==0}



//find all primes between 50-100

println search(50..100) { isPrime(it)}






