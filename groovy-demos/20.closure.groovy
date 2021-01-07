def plus(a,b) {a+b}

def min(a,b) {a-b}



def selectOperation(type){
    switch(type){
        case "+":return plus
        case "-":return minus
    }
}

assert selectOperation("+")(10,20)==30

assert selectOperation("-")(10,20)==-10


