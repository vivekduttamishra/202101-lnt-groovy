

//regular groovy function
int sum(int x, int y){

    x+y //<--- this value will be returned
}


//we can write similar function in different groovy closure syntax

def multiply = {
    int x,int y ->

    x*y
}

assert sum(10,20)==30

assert multiply(10,20)==200









println "all test passed"




