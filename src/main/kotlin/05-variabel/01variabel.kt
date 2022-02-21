//kotlin mempunyai dua jenis variabel yaitu mutable(dapat diubah) dan immutable(tidak dapat diubah)
//penulisan,mutable = var & immutable = val
//dalam penulisan direkomendasikan menggunakan immutable daripada mutable

//tidak perlu menuliskan tipe data pada val sudah otomatis seperti python
//pada val tidak dapat terjadi overwrite atau penumpukan data baru
val FirstName = "Pandu"

var LastName: String = "Wijaya"//dapat terjadi overwrite dengan nama variabel yg sama
LastName: String = "jamal" //disini terjadi overwrite