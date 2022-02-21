// no inline artinya tidak menggunakan inline
// saat menandai bahwa function adalah inline,secara otomatis semua parameter akan menjadi inline
// jika kita ingin tidak melakukan inline pada salah satu parameter,kita bisa menandai parameter tersebut dengan keyword "noinline"
// yang berarti parameter yg bukan inline akan berbentuk sebagai object

inline fun helloEverbody(firstname: () -> String, noinline lastname: () -> String): String {
    return "Hello ${firstname()} ${lastname()}"
}

fun main() {
    println(helloEverbody({"Pandu"},{"Wijaya"}))

    for (i in 0..10){//print dengan menggunakan perulangan loop for
        println(helloEverbody({"Ujang"},{"Sudrajat"}))
    }
}