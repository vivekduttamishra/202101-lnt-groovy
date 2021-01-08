class Person{
    String name
    int age

    def eat(food){
        "$name eats $food"
    }

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    String toString(){
        "$class.name Name:\t$name\tAge:$age"
    }
}

class Employee extends Person{
    static empCount=0
    final int id
    double salary
    Employee(String name, int age, double salary){
        super(name,age)
        this.id=++empCount
        this.salary=salary
    }

    String toString(){
        "${super.toString()}\tId:$id\tSalary:$salary"
    }

}


def emp=new Employee('Vivek',100,1)
def emp2=new Employee('Sanjay',40,10000)

println emp
println emp2

println emp.getId()