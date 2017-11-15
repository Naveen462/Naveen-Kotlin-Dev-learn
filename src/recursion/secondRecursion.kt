package recursion

/**
 * Created by SCI on 10/14/2017.
 */

//it has limited numbers to do recursion
// after some it will throw stack over flow
// for this we can use BigInteger
fun main(args:Array<String>){

    var num : Int = 5

    var fa:Int = fact(num)
    println(fa)

}
fun fact(num:Int):Int{
    if(num == 0)
        return 1
    else
        return num* fact(num-1)
}