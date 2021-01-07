
def range=1..10

//how do expand this range to store in a list
//I want to store individual values to the list not the range itself


def list1=[range]  //stores range as an object


assert list1.size()==1
assert list1.first() instanceof IntRange

//to expand a range as individual values we use spread operator (*)

def list2=[*range]  //spread the range value within the array

assert list2.size()==range.size()

assert list2[0] ==range.first()

assert list2[-1] ==range.last()


assert list2==[1,2,3,4,5,6,7,8,9,10]



println "all test passed"




