

def readRecords(def path) throws FileNotFoundException{

    def file=new File(path);  //may thro FileNotFoundException
    return file.text

}


def printRecord(){

    try{
        def record= readRecords("d:/myfile.txt")
        print record
    }catch(FileNotFoundException ex){

    }

}