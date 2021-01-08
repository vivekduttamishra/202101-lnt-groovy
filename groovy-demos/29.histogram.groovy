
//Histogram can take optional parameters to describe 
// design (default "=== ")
// align (default: True) --> if not aligned frequency value will not be aligned
// showValues (default:True)  ---> if not value will not be shown after the bars

def histogram  ( options,freq) {

    
    
    def showValues= options.showValues==null? true: options.showValues 

    def align = options.align==null?true:options.align

    def design=options.design?:'=== '   //if no design supplied use the default
    
    println "freq=$freq, align=$align, design=$design, showValues=$showValues"

    def max=0
    if(align){
        for(def x in freq){            
        
            def value=x.value
            if(value > max)
                max=value
        }
    
        max*=design.length()
    }
    
    for(def x in freq){
        def key=x.key
        def value= x.value
        def label= "$key".padLeft(5)
        def bar= (design*value)

        bar= align ?  bar.padRight(max)  : bar

        def fvalue= showValues? "$value".padLeft(5) : ""

        println "$label | $bar $fvalue"
    }

}





def f=[2:5, 3:2, 4:3, 5:5]

histogram(f, align:true)

histogram(f, design:'XXXX', align:false)

histogram(f, design:'XXXX', showValues:false)


histogram(f,design:'▓▓▓')