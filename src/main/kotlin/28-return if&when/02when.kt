//kita menggunakan return pada when

//tanpa menggunakan return when
fun main(){

    fun sayujang(name: String = ""): String{
        when(name){
            "" -> return "Hello Bro"
            else -> return "Hello $name"
        }
    }
    println(sayujang("jamal"))
    println(haram())
}

//menggunakan return
fun haram(nama: String = ""): String{
    return when (nama){
        "" -> "hello sist"
        else -> "hello $nama"
    }
}