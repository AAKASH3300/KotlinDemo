fun main() {
    val a: Int = 2

    when (a) // It is a spl keyword in Kotlin almost same as switch
    {
        // (->) Arrow operator to specify the action like Colon(:) in switch
        1 -> println("One")  //  no need use break
        2 -> println("Two")
        3 -> println("Three")
        else -> println("Give a proper input") // used instead of default in switch
    }
//---------------- "when" as Expression---------------------------------

    val num: Int = 2
    var str = when (num) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        else -> "Give a proper input"
    }
    println("Str is $str")
}