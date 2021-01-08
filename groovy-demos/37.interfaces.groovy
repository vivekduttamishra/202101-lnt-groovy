
class Runner implements Runnable {

    def name

    void run(){
        println "$name is running a race"
    }
    

}

def r=new Runner(name:'Vivek')

r.run()

