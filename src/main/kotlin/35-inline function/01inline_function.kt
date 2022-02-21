// menggunakan higher order function adalah salah satu fitur yg sangat berguna
/* namun penggunaan higher order function akan berdampakan terhdap performa saat aplikasi berjalan
* karena harus membuat object lambda berulang ulang jika penggunaannya tidak terlalu banyak mungkin tidak akan terasa
* tapi jika banyak sekali maka akan terasa impactnya
*/
// inline function adalah kemampuan di kotlin yg mengubah higher order function menjadi inline function
// atau istilah nya inline function mengubah higher order function menjadi function biasa
// dimana dengan inline function,code di dalam higher order function akan di duplicate agar pada saat runtime,aplikasi tidak perlu membuat lambda berulang ulang
// cara membuat inline function cukup menambahkan keyword inline di depan higher order function

inline fun helloEveryone(name: () -> String): String {
    return "Hello ${name()}" // alasan penggunaan ${name()} bukan begini $name,karena mengambil value dari lambda function
}

fun main(args: Array<String>) {
    println(helloEveryone{"Pandu"})
    println(helloEveryone{"Bobby"})
}

// kelebihan dari penggunaan inline function,higher order function tersebut tidak dibuat kedalam bentuk objek yg bisa kita lihat melalui bytecode yg terdapat pada intlej ide
// yang membuat performa aplikasi lebih baik saat berjalan
// gunakan pada saat saat tertentu saja,contohnya ketika dihadapkan pada perluangan higher order function dalam skala besar
// ketika kita mendapat perluangan dengan skala kecil kita tidak perlu menggunakan inline function
// intinya kita bisa menggunakan inline function sesuai dengan keadaan yg kita hadapi