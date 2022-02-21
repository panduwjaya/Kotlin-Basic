//penggunaan tanda it adalah kita tidak perlu menuliskan variabel pada parameter lambda function
//it dapat digunakan apabila parameter hanya satu dan tidak boleh lebih dari satu

fun main(){
    val sayHalloo: (String) -> String = {
        "hello $it" //kegunaan it menggantikan parameter pada val sayHalloo
    }
    println(sayHalloo("gunawan"))
}