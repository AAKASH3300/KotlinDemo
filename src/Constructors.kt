//Primary Constructor
// class Human constructor(var n : String) --> creating a constructor with parameter "n"
class Human(var n: String) // Unless we use a modifier we don't need a constructor keyword
{
    var age : Int = 0
    var name: String = n
//In Kotlin how many ever constructors we have we need to make sure to call Primary constructor
    constructor(age:Int,name:String) : this(name) //Secondary Constructor
    {
        this.age = age
    }

//    init {
//        name = n
//        println("Human is here...")
//    }

    fun think() {
        println("Android Developer --> $name : $age")
    }
}

fun main() {
    var h = Human(21,"Aakash") //If you don't want to pass value we can use default parameter
    h.think()
}