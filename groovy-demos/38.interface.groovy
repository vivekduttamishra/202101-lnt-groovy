interface CanFly{
    def fly()
}

interface CanSwim{
    def swim()
}

interface CanHunt{
    def hunt()
}


class Parrot implements CanFly{
    def fly(){
        "$this.class.name is flying"
    }
}


class Eagle  implements CanFly, CanHunt {
    def fly(){
        "$this.class.name is flying"
    }

    def hunt(){
        "$this.class.name is hunting its prey"
    }
}

class Shark implements CanSwim, CanHunt {

    def swim(){
        "$this.class.name is swimming"
    }
    def hunt(){
        "$this.class.name is hunting its prey"
    }
}

class Tiger implements  CanHunt {

    
    def hunt(){
        "$this.class.name is hunting its prey"
    }
}

class GoldFish implements CanSwim {

    def swim(){
        "$this.class.name is swimming"
    }
    
}

def testCapabilities(animal){

    if(animal instanceof CanSwim)
        println animal.swim()

    if(animal instanceof CanFly)
        println animal.fly()

    if(animal instanceof CanHunt)
        println animal.hunt()

    println()
}


def animals=[ new Tiger(), new Shark(), new Eagle(), new Parrot(), new GoldFish()]


animals.each{ testCapabilities it }    //for(def it in animals) testCapabilities it



