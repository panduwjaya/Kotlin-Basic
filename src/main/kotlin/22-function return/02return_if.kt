fun bagi(a: Int, b: Int): Int{//pada fungsi kembalian harus menulis tipe data kembaliannya
    if (b == 0){
        return 0 //jadi hasil nya 0
    }else{
        val total = a / b
        return total//maka akan mengembalikan isi dari variable total ke fungsi kembali
    }
    
}

fun main(){
    println(bagi(9, 3))
    println(bagi(9, 0))//maka hasilnya adalah 0 karena pada syarat jika 0 maka nilai kembaliannya = 0
}
