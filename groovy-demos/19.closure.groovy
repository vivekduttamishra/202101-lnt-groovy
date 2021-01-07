



def outer(oparam){

    int inner(int iparam){
        return oparam*iparam
    }

    def inner2= {iparam -> oparam*iparam}
    return inner2
}




def x= outer(5)

println x.class.name



println "all test passed"




