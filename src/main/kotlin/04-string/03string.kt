//string template dengan menggunakan tanda $
//gunanya untuk ekspresi sederhana atau mengambil data dari variabel/karakter lain
fun main(){
    var FirstName: String = "Pandu"
    var LastName: String = "Wijaya"
    var FullName: String = "$FirstName $LastName" //kurang complex
    var desc: String = "Nama lengkap $FullName banyak char = ${FullName.length}" //complex
    
    println(FullName)
    println(desc)
    
}