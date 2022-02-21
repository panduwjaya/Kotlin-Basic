//Function Varargs Parameter,Varargs merupakan singkatan dari variabel argumen
//Function Varargs Parameter merupakan parameters dengan bersifat seperti array di dalamnya
//bisa menerima banyak inputan seperti pada array.
//dalam penulisannya Varargs harus ditulis bagian paling kanan dalam parameter

/*
FUNGSI:
1)fungsinya adalah bisa menerima lebih dari satu inputan pada para meter
2)jika parameter menggunakan varags,kita dapat langsung memasukan datanya tanpa harus membuat array terlebihd dahulu
*/

//MEMBUAT ARRAY PADA PARAMETER TANPA VARARGS 
fun hitung(values: Array<Int>): Int {
    var total = 0
    for (value in values){
        total += value
    }

    return total
}

fun main(){
    val values = arrayof(10, 10, 10)
    val result = hitung(values)
    println(result)
}