//function named argument berguna ketika kita menuliskan parameter dalam jumlah banyak
//kita tidak perlu repot-repot menulis parameter secara tersusun

fun fullName(firstName: String, middleName: String, lastName: String){
    println("hello $firstName $middleName $lastName")
}

fun main(){
    fullName("edi", "saputra", "wijaya")//tanpa function named argument
    fullName(firstName = "edi", lastName = "wijaya", middleName = "saputra")//dengan function named argument
}