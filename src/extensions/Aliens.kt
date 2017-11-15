package extensions

/**
 * Created by SCI on 10/14/2017.
 */
class Aliens {
    var skills:String? = null

    fun show()
    {
        println("$skills of a person")
    }

    fun plus(a:Aliens) : Aliens{
        var new = Aliens()
        new.skills = this.skills +""+a.skills
        return new

    }

    infix fun add(a:Aliens) : Aliens{
        var new = Aliens()
        new.skills = this.skills +""+a.skills
        return new

    }

}