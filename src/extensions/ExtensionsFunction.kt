package extensions

/**
 * Created by SCI on 10/14/2017.
 */
fun main(args:Array<String>){
    var a1 = Aliens()
a1.skills = "naveen knows sql"

    a1.show()
    val a2 = Aliens()
    a2.skills = "nasndfnsafnsaf"
a2.show()

    var a3 = a1.plus(a2)
    a3.show()

    var a4 = a3 add a2
    a4.show()


    //operator overloading
    //infront infix and operator

    //infix function it will take one parameter

    //operator overloading

}

//fun Aliens.plus(a:Aliens):Aliens{
//    var newAlien = Aliens()
//    newAlien.skills=this.skills+""+a.skills
//return newAlien
//}