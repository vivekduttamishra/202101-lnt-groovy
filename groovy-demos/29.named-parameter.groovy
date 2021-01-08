

void showParams(def param){
    println "${param.getClass().name}\t$param"
}


showParams() // showParams(null)


showParams(1) 

//showParams(1,2) //error. because we are not takeing two parameters

//Named Value parameters
//You can pass number of parametrers as key:value pairs
//They would be collected as a map

showParams(name:'Vivek', email:'vivek@gmail.com')

showParams name:'Shivanshi', favColor:'Blue'
