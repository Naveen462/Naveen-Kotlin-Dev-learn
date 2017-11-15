package inheritance

/**
 * Created by SCI on 10/17/2017.
 */
open class A(age:Int){
    var age:Int = age
    init{
        println("first initialised this class")
    }
   open  fun A1(){
        println("function need age $age")
    }
}
class B(age: Int):A(age){

    init {
        println("second initialised this class")
    }

    override fun A1(){
println("extended class from A $age")
    }
}

fun main(args:Array<String>){

    var b = B(30)
    b.A1()
}