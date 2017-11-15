package interfaceforlearning

/**
 * Created by SCI on 10/17/2017.
 */

/*
In interface as same as abstract class but we can extend more than one interface
in before java 8 we are not able implement methods in the interface
but in java 8 we can implement the methods in interface itself

 */
interface G{
    fun think()

    fun what(){
        println("i implemented the method in interface itself")
    }
}
interface C{
    fun show()

}
class D:G,C{
    override fun think() {
        println("fidda movie")
    }

    override fun show() {
        println("ninu kori movie")
    }
}

fun main(args:Array<String>){
    var d = D()
    d.think()
    d.show()
}