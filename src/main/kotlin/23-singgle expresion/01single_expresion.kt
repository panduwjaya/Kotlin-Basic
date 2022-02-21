//single expresion function merupakan deklarasi function dengan hanya satu baris
//syarat untuk membuat single expresion adalah parameter pada fungsi harus satu buah tidak boleh lebih
//single expresion function merupakan fungsi dengan satu satu baris
//untuk membuat single expresion function cukup mengganti tanda kurung ({}) dengan tanda (=)

fun double(a: Int): Int = a*2 //artinya hasil dari Int = a*2 lgsg di return value ke fungsi double

fun hi(name: String): Unit = println("Hi $name")//ini fungsi tanpa kembalian atau Unit

fun main(){
    println(double(10))//bisa lgsg di println
    val result = double(10)//bisa menggunakan variabel
    print(result)
    hi("eko")//untuk unit lgsg tanpa variabel
}