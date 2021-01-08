





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


def searchEvens(def list){

    def result=[]
    for(def value in list)
        if (value%2==0)
            result<< value    //result.add(value)

    return result
}

def searchPrimes(def list){

    def result=[]
    for(def value in list)
        if(isPrime(value))
            result<<value

    return result

}

def list=[2,3,11,18,4,14,19,21,23,70,61,97,11,18]

println searchEvens(list)

println searchPrimes(list)