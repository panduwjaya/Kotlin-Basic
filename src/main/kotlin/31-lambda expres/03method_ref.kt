//method references adalah membuat lambda dari function yg sudah ada
//yitu mengambil function yg ada dengan me referensikan nya
//penggunaan ::(namafungsi) sangat wajib guna merenfrensikan nilai yg ada pada fungsi kepada lambda

fun toUpper(value: String): String = value.toUpperCase()

fun main() {
    val toUpper : (String) -> String = ::toUpper
    println(toUpperCase("Ujang Kurniawan"))
    
}