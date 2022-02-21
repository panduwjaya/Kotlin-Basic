//extension function
//kegunaan dari extension function adalah dapat merubah tipe data kedalam bentuk fungsi
//kegunaan kedua adalah untuk menambahkan fungsi pada tipedata dari source code orang lain
//kegunaan this adalah mengambil ekspresi yang ada pada variabel


fun String.hello(): String = "hello $this"
fun String.printHello(): Unit = println("hello $this")
//disini menggunakan single expresion pada fungsi


fun main (){
    val nama = "jamal"

    println(nama.hello())
    nama.printHello()
    "Pandu Wijaya".printHello()
}