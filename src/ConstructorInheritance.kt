open class Humans(age:Int) {
    init {
        //Primary constructor block
        println("in human $age")
    }

    open fun thinkers() {
        println("Real Thinking")
    }
}

class Aliens(age: Int) : Humans(age) {
    init {
        println("in alien")
    }

    override fun thinkers() {
        println("Virtual Thinking")
    }
}

fun main() {
    var x : Humans = Aliens(20)
    //x.thinkers()
}

// 1s goes to Primary Constructor of Aliens then to Primary Constructor of Humans