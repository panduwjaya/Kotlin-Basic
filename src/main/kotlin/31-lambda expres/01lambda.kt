//lambda adalah fungsi tanpa nama
//Lambda dapat diperlakukan sebagai value, contohnya bisa dimasukkan ke variabel dan argument.

fun main(){
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String -> //firstname variabel parameter
    val result = "$firstName $lastName"
    result
    }

    val hasil = contohLambda("eko", "kurniawan")
    println(hasil)
}
