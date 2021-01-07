
def values=[1,2,3,4,5]

//default list is ArrayList
assert values.class.name == "java.util.ArrayList"

//Array List has size
assert values.size() == 5

//You can add new value to array
values.add(10)
assert values==[1,2,3,4,5,10]


//we can use for-in loop to access array values

def count=0,sum=0
for(def value in values){
    count++
    sum+=value
}

assert count==values.size()
assert sum==25


println "all test passed"