//WHEN EXPRESION IS DIGUNAKAN PADA TIPE DATA
//WHEN EXPRESION IS ini akan berguna pada OOP
fun main(){
    val nilai = "ujang"
    
    when(nilai){
        is String -> println("Name is string")
        !is String -> println("name is not string")
    }
}