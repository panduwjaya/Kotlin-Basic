//pada kali ini kita akan mempelajari tentang null parameter
//ketika user tidak menginputkan nama belakang program tetap dapat berjalan
//JANGAN LUPA KETIKA MENGGUNAKAN NULL GUNAKAN TANDA TANYA (?)

fun sayHallo(firstName : String, lastName : String?){
    if (lastName == null){
        print("hello $firstName")
    }
    else{
        println("hello $firstName $lastName")
    }
}

fun main(){
    sayHallo("Pandu", "Wijaya")
    sayHallo("Bintang", null)//jadi yang terbca hanya yang depan saja
    sayHallo("Jamal", "Wijaya")
}