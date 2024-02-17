//Consumer -- interface in java
//Consumer interface has only one method accept
fun  main() {
    var values = listOf<Int>(1, 2, 3, 4)

    /*
    var con : Consumer<Int> = object : Consumer<Int> //Creating Interface obj using anonymous inner class
                                        {
                                        override fun accept(t: Int) {
                                        println(t)
                                        }

    }
    */

    values.forEach({ println(it) }) // obj of Consumer is passed as an argument
    //it-> that particular value, if we don't mention any variable name by default goes to "it"

    values.forEach(::println) // passing the behaviour,we are referring a method here
    // :: to refer method/class name of the function
}
