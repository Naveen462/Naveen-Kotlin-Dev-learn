import java.util.*

/**
 * Created by SCI on 10/9/2017.
 */

fun main(args:Array<String>){
val num :Int =2
    when(num)
    {
        1 -> println(num+2)
        2 -> println(num+3)
        3 -> println("three")
        else ->println("four")
    }

    var num2 = when(num)
    {
        3->"three"
        else ->"java    "
    }

    println(num2)

    var n  =1..10
    var n1= 10 downTo 1
    for (a in n1){
        println(a)
    }
    for(a in n1.reversed()){
        println(a)

    }

    for( a in n){
        println(a)

    }
    var n4 = listOf(1,2,3,4)
    for(i in n4){
        print(i)

    }

    var student = TreeMap<String,Int>()
    student["naveen"] = 462
    student["ravi"] = 463
    for((StudentName, RollNo) in student){

        println("Student details $StudentName and $RollNo")
    }

var result = add(45,5)


    result = 5


    when(result){
        5 -> println("i performed the multiplication operation")
        50 -> println("addition i did")
        else -> println("fsdfsafsadfsa")
    }


}


fun add(a:Int,b:Int):Int = a+b

fun max(a:Int,b:Int):Int = if (a>b) a else b
