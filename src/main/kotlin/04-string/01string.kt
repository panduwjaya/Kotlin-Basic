//string timemargin
fun main(){
    var FirstName: String = "Pandu"
    var Addres: String = """ 
    alamat provinsi lampung,
    kota metro
    """

    //perbedaan penggunaan trimmargin adalah agar dapat menghapus space sebelum kalimat
    var Addres1: String = """ 
    |alamat provinsi lampung,
    |kota metro
    """.trimMargin()

    //perbedaan penggunaan trimamargin ini adalah perbedaan penggunaan tanda (">") sebagai pembeda
    //sesuai dengan karakter yg diinginkan bisa sepert (<,> atau = dll)
    var Addres2: String = """ 
    >alamat provinsi lampung,
    >kota metro
    """.trimMargin(">")
    
    println(FirstName)
    println(Addres)
    println(Addres1)
    println(Addres2)
}