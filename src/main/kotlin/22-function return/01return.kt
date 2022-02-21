//return merupakan fungsi dengan pengembalian

fun kembali(a: Int, b: Int): Int{//pada fungsi kembalian harus menulis tipe data kembaliannya
    val total = a + b
    return total//maka akan mengembalikan isi dari variable total ke fungsi kembali
}

fun main(){
    println(kembali(200, 400))
    println(kembali(200, 500))

    val result = kembali(200, 300)//bisa di dalam variabel
    println(result)
    
    kembali(10, 20)//tidak akan muncul pada output
}