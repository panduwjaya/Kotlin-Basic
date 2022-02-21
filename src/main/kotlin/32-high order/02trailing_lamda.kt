//trailing lambda adalah kita tidak perlu memasukan lambda kedalam parameter
//lambda dapat diletakan diluar kurung parameter
//trailing lambda lebih disarankan dalam penulisan lambda

fun main(args: Array<String>) {

    fun hallo1(nama: String, transformer: (String) -> String): String {
        val namaTransformer = transformer(nama)
        return "Hello $namaTransformer"
    }

    //dibawah ini merupakan trailing lambda
    val result1 = hallo1("eko"){ value: String ->
        value.toLowerCase()
    }
    
    println(result1)
}