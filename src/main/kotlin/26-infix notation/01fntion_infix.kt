//function infix notation
//infix notation adalah melakukan operasi terhadap dua data
//hampir semua operasi matematika menggunakan infix notation
//penggunaan tanda titik (.) tidak wajib pada function infix notation

/*
SYARAT DARI INFIX NOTATION:
1.HARUS SEBAGAI MEMBER FUNCTION ATAU FUNCTION EXTENSION
2.HARUS MEMILIKI SATU PARAMETER
3.PARAMETER TIDAK BOLEH VARAGS DAN TIDAK BOLEH MEMILIKI DEFAULT VALUE PADA PARAMETER FUNCTION NYA
*/

//INFIX PADA STRING BERUPA "to" dan PADA INT BERUPA "downTo" atau "upTo"

infix fun String.to(type: String): String{
    if (type == "UPPER"){
        return this.toUpperCase()//"this" mengacu kepada parameter "type"
    } else {
        return this.toLowerCase()
    }
}

fun main() {
    val variabel1 = "Pandu Wijaya" to "UPPER" //fungsi "to" adalah sebagai perintah bahwa "Pandu Wijaya" dimasukan kedalam kategori "UPPER"
    println(variabel1)

    val variabel2 = "Pandu Wijaya" no "LOWER" //berhubung tidak memenuhi syarat sebagai "UPPER" pada percabangan maka tulisan "Pandu Wijaya" akan diubah kedalam bentuk lowerCase
    println(variabel2)

    //contoh salah satu infix notation adalah 1000 downTo 1,downTo merupakan salah satu function pada function infix notation

}