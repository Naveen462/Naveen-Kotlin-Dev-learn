package inheritance

/**
 * Created by SCI on 10/16/2017.
 */
open class Human{


    open fun think(){
        println("the comment is extend from extended classes")
    }


}

class Man: Human(){

    override fun think(){
        println("a  must be thinking")
    }


}


fun main(args:Array<String>){

    var v1 = Human()
    v1.think()
  var v2 = Man()
    v2.think()





}
