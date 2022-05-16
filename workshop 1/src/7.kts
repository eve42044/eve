fun main(args: Array<String>) {
    var i = 1
    val n = 13
    var F1 = 0
    var F2 = 1

    println("จำนวน $n ")
    print("รอบ : ")
    while (i <= n) {
        print("$F1 + ")

        val sum = F1 + F2
        F1 = F2
        F2 = sum
        i++
    }
}