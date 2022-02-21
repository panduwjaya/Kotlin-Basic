//range dengan step atau bisa disebut sebagai kelipatan atau selisih pada aritmatika
fun main(){
    var range = 0..100 step 5
    var range1 = 100 downTo 0 step 5 //fungsi reverse atau kebalikan dari {var range = 1..100}

    println(range)
    println(range.count())
    println(range.contains(50))//true,karena angka mencapai 100
    println(range.contains(200))//false,kareana angka tidak mencapai 200
    println(range.first)
    println(range.last)
    println(range.step)

}