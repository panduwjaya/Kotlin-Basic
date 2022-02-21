//array in for
fun main(){
    var array = arrayOf("eko", "ujang", "bintang")
    val ukuranArray = array.size - 1
    for (i in 0..ukuranArray){
        println("Index $i = ${array.get(i)}")
    }
}