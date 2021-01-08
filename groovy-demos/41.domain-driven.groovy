trait HasName{
    String name

    String toString(){ name }
}

class Person implements HasName{
    
    def eats(food){
        println "$this.name eats $food"
        return food
    }
}

class Food implements HasName{
    def with(food){
        println " with $food"
        return this
    }

    def and(food){
        println " and $food"
        return this
    }
}

def vivek=new Person(name:'Vivek')

def soup= new Food(name: "Soup")

def salad =new Food(name: "Salad")

def sandwich =new Food (name:"Sandwich")


guest(vivek).eats(sandwich).with(salad).and(soup)

//parentheses and . is optional

def guest(person){
    return person
}

guest vivek eats sandwich with salad and soup


