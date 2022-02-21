//penggunaan break dan continue dapat berguna dalam semua perulangan pada kotlin
//BELAJAR CONTINUE
//CONTINUE BERGUNA UNTUK MENGHENTIKAN PERULANGAN YG SEDANG BERJALAN dan MELANJUTKAN KE PERULANGAN SELANJUTNYA
fun main(){
    for (i in 1..100){
        if (i % 2 == 0){
            continue //fungsi dari continue adalah untuk menskip bil bulat dan melanjutkan ke ganjil
        }
        println(i)
    }
}