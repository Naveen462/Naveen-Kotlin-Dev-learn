package recursion

import java.math.BigInteger

/**
 * Created by SCI on 10/15/2017.
 */
fun main(args:Array<String>){

    var num = BigInteger("70000")

    var fa : BigInteger = fact1(num, BigInteger.ONE)
    println(fa)
}
tailrec fun fact1(num: BigInteger, result:BigInteger): BigInteger {
    if(num == BigInteger.ZERO)
        return result
    else
        return fact1(num- BigInteger.ONE, num*result)
}