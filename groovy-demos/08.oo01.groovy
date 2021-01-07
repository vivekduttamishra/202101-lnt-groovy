class Person{
    String name
    private String password

    public def getName(){name}

    private def getPassword(){password}

    private def setPassword(password){this.password=password}
    private def setName(name){this.name=name}

}

def p1=new Person(name:'Vivek',password:'pass')



p1.name='Vivek D Mishra'
p1.password='pass2'

println "name=$p1.name"
println "password=$p1.password"

p1.setPassword "hello"

println "name=$p1.name"
println "password=$p1.password"


