//when expresion sama saja dengan switch expresion
//ini lebih mudah ketika menemui kasus banyak option dengan menentukan output

fun main(){
    val nilai = 90

    when (nilai){
        100 -> println("perfect")
        90 -> println("good job")
        80 -> println("nice")
        70 -> println("not bad")
        55 -> println("bad")
        else -> println("you failed")
    }
}