//clousre tidak disarankan dalam kotlin
//closure lebih mirip kepada overwrite pada pemograman atau penimpahan


/*
-closures adalah kemampuan function,lambda dan annonymous function berinteraksi dengan 
 variabel atau data sekitar pada scope yang sama
-dengan adanya ini kita harus berhati-hati karana mampu mengoverwrite data yg ada.
*/

fun main(args: Array<String>) {
    var counter: Int = 0
    var name: String = "Pandu"

    val lambdaIncreement: () -> Unit = {
        println ("lamdbda increement")
        counter++ //disetiap ini terjadi overwrite
        name = "Ujang setiawan" //terjadi overwrite
    }

    val annonymousIncreement = fun(){
        println("anonnymous function increement")
        counter++//terjadi overwrite
    }

    fun functionIncreement(){
        println("function Increement")
        counter++//terjadi overwrite
    }

    lambdaIncreement()
    annonymousIncreement()
    functionIncreement()
    lambdaIncreement()
    annonymousIncreement()
    functionIncreement()

    println(counter) //hasil = 6
    println(nama) //hasil = "Ujang" karena terjadi overwrite pada variabel
}