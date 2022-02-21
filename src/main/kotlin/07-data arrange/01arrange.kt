//fungsi range pada kotlin seperti perulangan pada python
/*
OPERASI RANGE
count() = mendapatkan total data di range
contains(value) = mengecek apakah terdapat value tersebut
first = mendapatkan nilai pertama
last = mendapatkan nilai terakhir
step = mendapatkan nilai tiap kenaikan
*/

fun main(){
    var range = 1..100
    var range1 = 100 downTo 1 //fungsi reverse atau kebalikan dari {var range = 1..100}

    println(range)
    println(range.count())
    println(range.contains(50))//true,karena angka mencapai 100
    println(range.contains(200))//false,kareana angka tidak mencapai 200
    println(range.first)
    println(range.last)
    println(range.step)

}