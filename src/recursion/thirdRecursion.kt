package recursion

import java.math.BigInteger

/**
 * Created by SCI on 10/14/2017.
 */

/*
If use big integer also you have some limit number after that you will get stack overflow exception

tail recuresion using tailrec
 */
fun main(args:Array<String>){
    var num = BigInteger("70")
    var fa :BigInteger = fact(num)
    println(fa)
}
fun fact(num:BigInteger):BigInteger{
    if(num == BigInteger.ZERO)
        return BigInteger.ONE
    else
        return num* fact(num- BigInteger.ONE)
}


