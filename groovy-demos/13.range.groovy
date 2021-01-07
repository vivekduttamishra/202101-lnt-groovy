//A range is a dynamic value represented between min-max

def range=1..10  //we have defined a range


println "range is $range"

assert range instanceof IntRange

assert range.size()==10

assert range[0]==1

assert range[-1]==10

assert range instanceof List

//but range doesn't support addition
try{
range.add(10)
assert ! "range can't add new values"
}catch(UnsupportedOperationException ex){

}

println "all tests passed"

