
void pyramid(size){
    def block=' * '
    def largest= block.length()*size;

    for(def i=1;i<=size;i++){
        println( (block*i).padLeft(largest))
    }
}

pyramid(5)