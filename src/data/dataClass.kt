package data

/**
 * Created by SCI on 10/18/2017.
 */
data class f(var name:String){


    fun show(){
        println("i am not calling this function")
    }

}
fun main(args:Array<String>){

    var d= f("naveen")
    println(d)

    var d2= f("naveen")
    println(d.equals(d2))



}