//function scope adalah ruang lingkup dimana sebuah function bisa diakses
//saat kita membuat function di dalam file kotlin,maka fungsi itu dapat diakses dari file kotlin manapun
//ingin membatasi sebuah function yg hanya dapat diakses dalam funcion tertentu,kita bisa membuat function in function atau inner funuction

fun satu(){
    println("ini bukan function scope")
}

fun dua(){
    satu()//fungsi dua dapat mengakses fungsi satu
}

fun tiga(){
    //sentence()
    //namun fungsi satu,dua dan tiga tidak bisa mengakses fungsi sentence diakrenakan function scope yg dapat diakses dari fun main()
    //tetapi fun main() dapat mengakses fungsi satu,dua dan tiga
}

fun main(){
    fun sentence(){
        println("function scope")
    }
    sentence()
}