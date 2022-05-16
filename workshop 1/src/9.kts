fun main() {
    var money = 195600

    if (money % 100 == 0 && money != 0)
        println("$money ฿")
    if (money >= 1000) {
        var b = money / 1000
        println("1000-฿ $b bills")
        money = money - b * 1000

    }
    if (money >= 500) {
        var b = money / 500
        println("500-฿ $b bills")
        money = money - b * 500
    }
    if (money >= 100) {
        var b = money / 100
        println("100-฿ $b bills")
        money = money - b * 100
    }
    else
        print("Please enter your money more than 100")

}