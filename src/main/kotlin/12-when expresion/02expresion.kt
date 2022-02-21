//ketika ada jawaban multi option 'A' || 'B' || 'C'
//MAKA MENGGUNAKAN WHEN EXPRESION MULTI OPTION

fun main(){
    val nilai = "A"

    when(nilai){
        "A" , "B" , "C" -> { println("anda lulus")}
        else -> {println("maaf anda tidak lulus")}
    }
}