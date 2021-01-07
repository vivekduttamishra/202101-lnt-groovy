//A range is a dynamic value represented between min-max


// 1..10 represents a single Range object
// here we are putting the range object in  a list
def list=[1..10]

assert list.size() == 1   //we have a single object in the list

assert list[0] instanceof IntRange

//Range can have steps of

def values=('a'..'z').step(2).join(',')


assert values=='a,c,e,g,i,k,m,o,q,s,u,w,y'

//generally a range is exclusive of upper bound 
//in groovy range by default includes upper bound
//If we want to exclude upper bound we can use exclusive syntax


def range2= 0..<10

assert range2.last()==9


println "all test passed"




