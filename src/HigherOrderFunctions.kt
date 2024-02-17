//Higher Order Function
//Functional programming --> we pass function inside a function

fun main(){
    var values = listOf<Int>(1,2,3,4)

    println("External For Loop")
    for(i in values) //external for loop
        println(i)

    println("for each loop")
    values.forEach({ println(it) }) // passing a fun to a fun --> println() inside forEach()
}