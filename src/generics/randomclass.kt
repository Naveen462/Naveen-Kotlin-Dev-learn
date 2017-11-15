package generics

/**
 * Created by SCI on 10/10/2017.
 */
open class Fruit
class Apple : Fruit()
class Orange : Fruit()

class Crate<T>(val elements:MutableList<T>){
    fun add(t:T) = elements.add(t)
    fun last():T = elements.last()
}



