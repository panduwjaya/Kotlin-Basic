//high order function adalah function yg menggunakan function sebagai parameternya
//artinya adalah function di dalam function
//nah yang menjadi parameter nya adalah fungsi lambda

fun main() {

    fun hallooo(nama: String, transformer: (String) -> String): String {
        val namaTransformer = transformer(nama)
        return "Hello $namaTransformer"
    }

    val lambdaUpper = {value: String -> value.toUpperCase()}
    println(hallooo("Eko", lambdaUpper))

    //tanpa melalui variabel,tapi memasukan lambda langsung kedalam parameter funsi hallo
    println(hallooo("Eko", {value: String -> value.toLowerCase()}))
}