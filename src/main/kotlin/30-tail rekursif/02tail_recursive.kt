//penerapan tail recursive pada factorial
//else -> factorialTail(value - 1,totall * value) tidak boleh else -> factorialTail(value - 1,totall * value) * value

/*CARA KERJA:
1.factorialTail(5,1)
2.factorialTail(4,5)
3.factorialTail(3,20)
4.factorialTail(2,60)
5.factorialTail(1,120)
totall akhir = 120

*/
fun main(){
    tailrec fun factorialTail(value: Int,totall: Int = 1): Int{
        return when (value){
            1 -> totall
            else -> factorialTail(value - 1,totall * value)//mencari cara agar rumus masuk kedalam parameter factorialTail
        }
    }
    println(factorialTail(10))
}