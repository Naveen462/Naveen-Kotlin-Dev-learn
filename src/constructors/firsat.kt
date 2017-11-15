package constructors

/**
 * Created by SCI on 10/15/2017.
 */

/*
primary constructors are we can pass parameters
 and also you can use constructor
 */

/*
secodary constructor
you can write one more constructor with in the class
 */
class firsat(name :String) {
var name :String =""
    fun think(){
    println("kotlin is awesome  ......$name")
    }
}

fun main(args:Array<String>){
    var n1 = firsat("Naveen ReddY Muntha")
    n1.think()
}