package subtask1

import java.math.BigInteger

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {

        var res_K: Int? = null

        val src_C = array[0]
        val n = array[1]

        if(src_C<0 || n<=0) return null

        for(i in 1..n){
            val C = fact(n)/fact(i)/fact(n-i)
            if(src_C <= C) {
                if(res_K == null)
                {
                    res_K = i
                }
                else{
                    if (res_K > i){
                        res_K=i
                    }
                }
            }
        }

        return res_K
    }

    fun fact(f: Int): Long {
        if(f == 1 || f == 0) return 1
        return f*fact(f-1)
    }
}
