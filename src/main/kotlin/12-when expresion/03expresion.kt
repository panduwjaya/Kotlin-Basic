//WHEN EXPRESION IN ATAU WHEN DI DALAM ARRAY
//WHEN EXPRESION "IN" DIGUNAKAN PADA VARIABEL
fun main(){
    val nilai = "D"
    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
    when(nilai){
        in nilaiLulus -> println("selamat anda lulus")
        !in nilaiLulus -> println("maaf anda tidak lulus")
    }
}