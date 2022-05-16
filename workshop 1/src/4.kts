 fun main() {
        val a = 14
        val b = 5
        val c = 32

        val max = if (a > b) {
            if (a > c)
                a
            else
                c
        } else {
            if (b > c)
                b
            else
                c
        }
        println("max = $max")
    }