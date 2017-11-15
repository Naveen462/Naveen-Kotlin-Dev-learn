@file:JvmName("default");


fun main(args: Array<String>){

    val age = totalamount(10)
    println(age)

}

@JvmOverloads
fun totalamount(amount : Int , interest:Double =0.5): Int = (amount+amount*interest).toInt()
