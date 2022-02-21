//when sebagai pengganti if else
fun main(){
    val exam = 90

    when{
        exam > 80 -> println("nice")
        exam < 70 -> println("bad news")
        else -> println("please try again")
    }
}