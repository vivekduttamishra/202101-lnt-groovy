
//In groovy we can choose which List we want to use

def values= [1, "hello", true, 20.5]  as LinkedList

assert values.class==LinkedList.class

//Groovy Specials!

def numbers=[1,2,3,4,5]

//multiplying a list simply repeats the list value number of times
println numbers*2
assert numbers*2 == [1, 2, 3, 4, 5, 1, 2, 3, 4, 5]


//new way to add items in the list

numbers<<100   //add 100 to the end of the list. same as list.add(100)
println numbers
assert numbers == [1,2,3,4,5,100]


// groovy supports negative index like python
// [-1]  is the last item
// [-2]  is the second last item

assert numbers[-1] == 100

assert numbers[-2] == 5

assert numbers[-numbers.size()]==numbers[0]



//It is permissible to access items beyond the size of the list
//if you access an invalid index it returns null
//It doesn't throw any exception
assert numbers[1000]==null




//You can also set a new value at an non-existing index
//Array will automatically expand to meet the needs
//middle items will be null
numbers=[1,2,3,4,5]

assert numbers.size()==5
assert numbers==[1,2,3,4,5]

//suppose we are assigning value to index 10

numbers[10]=100

//now array size increases to 11
assert numbers.size()==11
println numbers
assert numbers==[1,2,3,4,5,null,null,null,null,null,100]


//We can set multiple array index of an existing list

numbers[5..8]=[10,20,30,40]  //numbers[5]=10, numbers[6]=20, numbers[7]=30


assert numbers==[1,2,3,4,5,10,20,30,40,null,100]





println "all test passed"