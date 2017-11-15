package extensions

/**
 * Created by SCI on 10/14/2017.
 */
fun main(args:Array<String>){

//    val 1 = mutableListOf(1,2,3)
//    1.swap(0,2)


}


fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}