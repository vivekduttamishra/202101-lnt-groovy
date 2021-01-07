
class Person{

    String name;
    private int age;
   
    public int getAge(){age}

    public void setAge(int newAge){
        if(newAge>age)
            age=newAge;
    }

    boolean isAdult(){age>=18}
}


def p1=new Person(name:'Shivanshi', age:14)



println "name is ${p1.getName()}"

println "age is ${p1.getAge()}"


p1.age=12 //ignored
println "new age is $p1.age"

p1.age=16
println "new age is $p1.age"
