//abstract classes are meant to be overridden and inherited, so we have no need to use "open" keyword
abstract class Staff { //abstract method should be a part of abstract class
    abstract fun duty()  // abstract method we only declare it we will not define it
    fun action()
    {
        println("Give Punishment")
    }
}
class Maths : Staff()
{
    override fun duty() {
        println("Teach Maths")
    }
}
class Student : Staff()  {
    override fun duty() {
        println("Listening")
    }
}

fun main() {
    var s1 : Staff = Student()
    s1.duty()
    s1.action()
}