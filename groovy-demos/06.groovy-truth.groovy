
void lieDetector(value){
    if(value)
        println "$value is true"
    else
        println "$value is false"
}

lieDetector(true)
lieDetector(false)

lieDetector(7)
lieDetector(-9)
lieDetector(0.02)
lieDetector(0)

lieDetector("Lie")
lieDetector("false")

lieDetector("")

lieDetector(null)

lieDetector([1,2,3,4])

lieDetector([])

lieDetector([0])




