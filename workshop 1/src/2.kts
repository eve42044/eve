fun main(){
    val score = 79
    if (score < 0){
        println("error")
    }else if (score < 50) {
        println("F")
    }else if (score < 55){
        println("D")
    }else if (score < 60){
        println("D+")
    }else if (score < 65){
        println("C")
    }else if (score < 70){
        println("C+")
    }else if (score < 75){
        println("B")
    }else if (score < 80){
        println("B+")
    }else if (score < 101){
        println("A")
    }else{
        println("error")
    }

}
