//fungsi yang memanggil dirinya sendiri
//pemananfaatan nya untuk membuat faktorial

fun main(){
    
    //tanpa rekursif
    fun factorialLoop(value: Int): Int{
        var result = 1
        for (i in value downTo 1){
            result *= i
        }
        return result
    }
    println(factorialLoop(10))

    //menggunakan rekursif
    //jenis yg digunakan rekursif call atau pemngilan berulang ulang
    fun faktorialRekursif(nilai: Int): Int{
        return when (nilai){
            1 -> 1
            else -> nilai*faktorialRekursif(nilai - 1)
        }
    }
    println(faktorialRekursif(10))
}

