
class Animal{
    def eat(){"$this.class.name is eating"}
}

class Domestic{

    int price
}

trait CanFly{
    def fly(){" $this.class.name is flying"}
}

trait CanSwim{
    def swim(){"$this.class.name is swimming"}
}

trait CanHunt{
    def hunt(){"$this.class.name is hunnint its prey"}
}

interface HasPrice{
    def getCost()
}


class Parrot extends Animal implements CanFly, HasPrice{

    def getCost(){ 500 }
}

class Eagle extends Animal implements CanFly, CanHunt {}

class Shark extends Animal implements CanSwim, CanHunt {}


class Tiger extends Animal implements  CanHunt {}


class GoldFish extends Animal implements CanSwim, HasPrice {
    def getCost(){ 50 }
}

class Robot implements CanFly,CanSwim, HasPrice{
    def getCost(){500000}
}


def testCapabilities(entity){

    if(entity instanceof Animal)
        println entity.eat()

    if(entity instanceof HasPrice)
        println "cost of $entity.class.name is $entity.cost"


    if(entity instanceof CanSwim)
        println entity.swim()

    if(entity instanceof CanFly)
        println entity.fly()

    if(entity instanceof CanHunt)
        println entity.hunt()

    println()
}


def animals=[ new Tiger(), new Shark(), new Eagle(), new Parrot(), new GoldFish(), new Robot()]


animals.each{ testCapabilities it }    //for(def it in animals) testCapabilities it



