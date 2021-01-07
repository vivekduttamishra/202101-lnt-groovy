class Person{

    String name;
    int age;
    boolean isAdult(){age>=18}
}


def p1=new Person(name:'Shivanshi', age:14)

println "$p1.name is adult: $p1.adult"

def p2=new Person(name:'Vivek', age:100)

println "${p2.getName()}  is adult: $p2.adult"

