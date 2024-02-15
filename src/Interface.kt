//Kotlin and Java support Multiple Inheritance through Java
interface A {
    fun show() // No need to use abstract by default all the methods,functions in an interface are abstract
    fun abc() { // from java 8 interface can have default methods i.e. method definition the same works in kotlin
        println("in abc A")
    }
}

interface B {
    fun display()
    fun abc() {
        println("in abc B")
    }
}

class C : A, B {
    override fun show() {
        println("in show")
    }

    override fun display() {
        println("in display")
    }

    override fun abc() { // As both interface have same fun we override to prevent ambiguity
        super<A>.abc() // we use generics to specify the type
    }

}

fun main() {
    var obj = C()
    obj.show()
    obj.display()
    obj.abc()
}

//NOTE: Go for interfaces always instead of abstract classes.