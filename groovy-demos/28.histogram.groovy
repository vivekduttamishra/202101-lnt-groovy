

def histogram = { freq ->

    def design='=== '
    
    def max=0
    for(def x in freq){
        
       
        def value=x.value
        if(value > max)
            max=value
    }
   
    max*=design.length()
    
    for(def x in freq){
        def key=x.key
        def value= x.value
        def label= "$key".padLeft(5)
        def bar= (design*value).padRight(max)
        def fvalue= "$value".padLeft(5)
        println "$label | $bar $fvalue"
    }

}





def f=[2:5, 3:2, 4:3, 5:5]

histogram(f)

