fun main(args: Array<String>) {
    var sum = 0
    for (i in 10 downTo 1 )
        sum += i
    println()
    for (i in 10 downTo 1)
        print("$i  ")
    println("sum = $sum")

    //
    for (i in 1..19 step 2)
        sum = sum+2
    println()
    for (i in 1..19 step 2)
        print("$i  ")
    println(" sum = $sum")

    ///
    for (i in 1 downTo -19 step 2)
        sum = sum -8
    println()
    for (i in 1 downTo -19 step 2)
        print("$i  ")
    println(" sum = $sum")

}
