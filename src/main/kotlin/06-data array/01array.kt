

import kotlin.arrayOf//array pada kotlin hanya dapat menampung satu tipe data semisal hanya string saja atau integer saja

/**
//OPERASI ARRAY
*index array di kotlin sama seperti pada C++ yaitu dimulai dari nol (data pertama = index ke-0)
*size = untuk mendapatkan panjang array
*get(index) = mendapat data di posisi index
*[index] = mendapat data di posisi index
*set(index, value) = mengubah data di posisi index
*[index] = value ,mengubah data di posisi index
*/

fun main(){
    val members: Array<String> = arrayOf("eko", "joko", "ujang")//arrayof merupakan function
    val members1: Array<Int> = arrayOf(10, 20, 30)
    val chance: String = members[0]//untuk mengakses data indeks ke-0,pada array members
    val chance1: String = members.get(0)//untuk mengakses data indeks ke-0,pada array members
    //val yg dimaksud pada array adalah tidak bisa mengubah variabelnya namun bisa mengubah isi data dari variaabelnya

    members.set(1,"bintang")//merubah nilai pada index ke-1
    println(members)//hasil tidak dapat dibaca masih berbentuk nilai memory ([Ljava.lang.String;@28a418fc)
    println(members1)//hasil tidak dapat dibaca masih berbentuk nilai memory ([Ljava.lang.String;@28a418fc)
    println(members[0])//cara untuk melihat nilai index ke-0 pada array member
    println("nilai dari index 1 adalah: "+members[1])
}