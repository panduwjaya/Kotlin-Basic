//dibuat tail recursive dengan tujuan agar tidak terjadi overflow
//karena pada java/bahasa berbasis oop lainnya memiliki kelemahan yaitu tidak dapat memanggil fungsi yg terlalu banyak
//tail recursive merupakan teknik mengubah rekursif menjadi looping biasa saat dijalankan

/*SYARAT TAIL RECURSIVE:
1.TAMBAHKAN (tailrec) pada function nya
2.saat memanggil dirinya sendiri,hanya boleh memanggil fucntion dirinya sendiri tanpa tambahan operasi dari data lain
*/

fun main(){
    //dengan adanya tambahan tailrec secara otomatis compailer mengartikan rekursive menjadi perulangan biasa
    //ini cocok untuk recursive dengan jumlah data banyak
    tailrec fun display(value: Int){
        println("Recursive $value")
        if (value > 0){
            display(value - 1)//disini tidak boleh (display(value - 1) * value) jadi harus display(value - 1) saja tanpa tambahan
        }
    }

    display(100000)
}