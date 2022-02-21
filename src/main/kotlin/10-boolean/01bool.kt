//bentuk boolean nya mirip dengan C++
fun main(){
    val nilaiUjian = 88
    val nilaiAbsen = 88
    val nilaiEkstra = 78

    val apakahLulusUjian = nilaiUjian > 75
    val apakahLulusAbsen = nilaiAbsen > 75
    val apakahLulusEkstra = nilaiEkstra > 75

    val apakahlulus = apakahLulusUjian && apakahLulusAbsen && apakahLulusEkstra
    //val apakahlulus = ((apakahLulusUjian && apakahLulusAbsen) && apakahLulusEkstra)
    //jadi perhitungan boolean dimulai dari sebelah kiri terlebih dahulu
    //serta mendahulukan yang berada di dalam kurung
    println(apakahlulus)
}