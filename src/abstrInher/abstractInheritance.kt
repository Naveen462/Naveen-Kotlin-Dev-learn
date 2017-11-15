package abstrInher

/**
 * Created by SCI on 10/17/2017.
 */

abstract class A{

    abstract fun think()

    open  fun t1(){
        println("therer will be a abstract method")
    }


}

abstract class B: A() {
   override fun think()
    {
        println("fsafas")
    }
    override fun t1(){

    }
}
