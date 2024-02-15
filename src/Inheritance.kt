//By default all the classes,functions and methods in Kotlin are "final".
//open --> keyword used to allow other classes to inherit your class
open class human {
    open fun thinking() { // open keyword allows the final method thinking() to be overridden
        println("Real Thinking")
    }
}

// Multiple Inheritance not supported in Kotlin,You cannot extend more than one class
class alien : human()  // : --> use to inherit like extends in Java
{
    override fun thinking() { //Method overriding
        println("Virtual Thinking")
    }
}

fun main() {
    var aak = alien()
    aak.thinking()
}

// Create Human reference alien object
// Human h = new Alien() --> Java
// var aak : Human = Alien()  --> Alien