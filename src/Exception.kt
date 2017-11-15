/**
 * Created by SCI on 10/14/2017.
 */
fun main(args:Array<String>){
    var s:String = "4a"
    var i:Int
    try {
        i = s.toInt()
    }catch (e : NumberFormatException)
    {
        println("give a proper format of integer")
    }

    var i1: String ="3a"
    var i2:Int =try{
        i1.toInt()

    }catch (e: NumberFormatException)
    {
       0
    }
    println(i2)

    dadfasfsa(5,4)


}
fun dadfasfsa(a:Int,b:Int){
    if(a>b){
        return
    }else{
        println("always better")
    }
}