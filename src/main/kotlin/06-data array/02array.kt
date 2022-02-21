//array nullable
//null = kosong
fun main(){
    val members: Array<String?> = arrayOfNulls(5)// 5 adalah banyak index/panjang array
    members[1] = "ujang"
    members[2] = "reza"

    println(members[0])//hasil "null"
    println(members[1])
    println(members[2])
}