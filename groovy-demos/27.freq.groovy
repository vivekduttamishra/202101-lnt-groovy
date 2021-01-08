
def frequency(...numbers){

    //frequency table which should be a map
    def table= [:]   //: indicates empty map. without colon its an empty list

    //calcualte frequency of each value and add as key value pair in the able
    for( def key in numbers ){

        //if(table[key]!=null) //this key is not present

        if(key in table)  
            table[key]+=1
        else 
            table[key]=1

    }

    //return table
    return table
}

//frequency can work with any series of values passed independently
println frequency(2,3,4,2,2,2,4,4,5,3,5,5,2,5,5)

//but will fequencey work with real list?
def values=[2,3,4,2,2,2,4,4,5,3,5,5,2,5,5]

println frequency(values)

println frequency(*values)


