//fungsi dari label adalah untuk penanda
//semua expresion pada kotlin dapat ditandai sebagai penanda
//cukup gunakan (@) sebagai penanda

/*
-dapat diaplikasikan pada return,continue dan break
-kita dapat menghentikan perulangan pada blok manapun menggunakan (@)
*/
fun continueLabel (){ //penggunaan label pada expresion continue
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10){
            println("$i x $j = ${i*j}")
            if (j == 10){
                continue@loopI
            }
        }
    }    
}


fun main(args: Array<String>) { //penggunaan label pada expresion break
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10){
            println("$i x $j = ${i*j}")
            if (j == 10){
                break@loopI
            }
        }
    }    
}