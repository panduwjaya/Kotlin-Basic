//pada kali ini kita akan mempelajari tentan function default arrgument
//default argument mirip dengan null pada parameter
//BEDANYA HANYA PADA DEFAULT PARAMETER TIDAK PERLU MEMASUKAN NULL PADA PARAMETER YG KOSONG
//PADA DEFAULT PARAMETER MENGGUNAKAN TANDA (=),tapi wajib (?) ketika menggunakan null di dalamnya

fun sayHalo(firstName : String, lastName : String? = null){//string=null adalah default parameter
    if (lastName == null){
        print("hello $firstName")
    }
    else{
        println("hello $firstName $lastName")
    }
}

fun main(){
    sayHalo("Pandu", "Wijaya")
    sayHalo("Bintang") //jadi tidak perlu diisi penuh parameter dari sayHalo
    sayHalo("Jamal", "Wijaya")
}