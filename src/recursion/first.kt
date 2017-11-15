package recursion

/**
 * Created by SCI on 10/14/2017.
 */
fun main(args:Array<String>){

    var num :Int = 5

    var fact =1
    for (i in 1..num){
        fact = fact*i
    }
    println(fact)
}