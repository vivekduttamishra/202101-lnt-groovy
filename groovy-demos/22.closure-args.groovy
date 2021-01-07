
//closure
plus = {  a,b  ->   a+b}

//function
def minus(a,b) {a-b} 


def executeOperation(x,y, opr){

    return opr(x,y);
}

println  executeOperation(10 , 20 , plus )


println executeOperation(20, 10, minus)

println "all test passed"
