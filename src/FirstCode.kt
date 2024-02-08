import javaclass.Hero

fun main() {
    println("Hello World !!")

    var tatto = Alien() //Object

    // val tatto = Alien(); this works fine
    // Again if we try to create an object tatto = Alien (); --> Error:Val cannot be reassigned

    tatto.name = "Aakash"

    println("Name is:" + tatto.name) // using concatenation as in JAVA

    println("Name is: ${tatto.name}") //${tatto.name} --> it returns the value of it

//-------------- Using JAVA class in kotlin -----------------------------------

    var hero = Hero()

    hero.name = "Varsha" //No need to call getters and setter kotlin will do it in the backend

    println("Name is : ${hero.name}")

}