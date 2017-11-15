/**
 * Created by SCI on 10/7/2017.
 */

class Person constructor(var firstName:String, var lastName:String,var age:Int)

fun main(args:Array<String>){
    val person1 = Person(lastName = "Muntha",firstName = "Naveen", age= 20)
    print("firstName ${person1.firstName} \n lastName ${person1.lastName} \n age${person1.age}")
}