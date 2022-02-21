//return if & when
//manfaat dari return if & when ketika kita memiliki percabangan banyak kita tidak repot menulis satu-satu

fun hallo(name: String = ""): String{ /*jika kita tidak memanfaatkan return if&when maka 
                                        kita harus menulis return pada setiap hasilnya*/
    if (name == ""){
        return "hello bro!!!"
    } else {
        return "hello $name"
    }
}

fun main(){
    fun halllo(name: String = ""): String{ /*ketika kita menggunakan return if&when kita tidak perlu 
                                            menuliskan return per baris*/
        return if (name == ""){
            "hello bro!!!"
        } else {
            "hello $name"
        }
    }   
}