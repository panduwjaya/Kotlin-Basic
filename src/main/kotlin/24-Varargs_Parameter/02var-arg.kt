//MEMBUAT PARAMETER MENGGUNAKAN VARARGS
fun menghitung(nama: String,vararg nilai: Int): Int {
    var totall = 0

    for (quese in nilai){
        totall += quese
    }

    return totall
}

fun main(){
    //val values = arrayof(10, 10, 10)
    val totall = menghitung("jamal",20, 20, 20)//dengan begiut kita dapat memasukan banyak input tanpa array
    println(totall)
}