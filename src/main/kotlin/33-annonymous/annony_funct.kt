//annonymous function merupakan fungsi tanpa nama
//annonymous function merupakan lanjutan dari lambda
//perbedaaan anonymous function adalah annonymouse function untuk menyelesaikan permasalahan yang lebih complex
//sedangkan lambda untuk menyelesaikan permasalahan yang sederhana
//pada lambda tidak mendukung adanya fungsi return,sedang pada annonymous mendukung return

fun main(args: Array<String>) {
    fun hello(nama: String, belakang: (String) -> String): String {
        val namaBelakang = belakang(nama)
        return "hello $namaBelakang"
    }
    
    val upper = fun(value: String): String{ //ini merupakan annonymous function
        if (value == ""){
            return "UPS"
        } else {
            return value.toUpperCase()
        }
    }

    println(hello("TEJO",upper))
    println(hello("",upper))

    //ini adalaha anonymous function as parameter
    println(hello("ujang",fun(value: String): String{ //parameter bisa langsung diisi dengan annonymous function
        return value.toLowerCase()
    }))
}