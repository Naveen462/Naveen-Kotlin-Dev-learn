package `object`

/**
 * Created by SCI on 10/18/2017.
 */
data class Book(var bookName:String,var cost:Int )

object Bookself{
    var books= arrayListOf<Book>()

    fun showBookself(){

        for(i in books){
            println("I have this books in home $i")
        }
    }

}
fun main(args:Array<String>){
    Bookself.books.add(Book("Kotlin cook book", 35))
    Bookself.books.add(Book("Kotlin cook k", 356767))
    Bookself.books.add(Book("Kotlin cobook", 3))
    Bookself.books.add(Book("Kotlin cook ook", 40))

    Bookself.showBookself()


}