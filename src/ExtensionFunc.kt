// Extension Function, Infix Function,Operator Overloading
fun main() {
    var a = Animal()
    a.str = "Java"
    a.show()

    var a2 = Animal()
    a2.str = "Kotlin"
    a2.show()

//    var a3 = a.plus(a2)
//    a3.show()

//    var a3 = a plus a2 // here,plus --> infix function
//    a3.show()

    var a3 = a + a2 // here,+ --> operator overloading
    a3.show()
}

//infix function is like english and takes only one parameter ,use "infix" keyword
//Operator overloading use "operator" keyword before the function
//Operator overloading in Kotlin has limited set of operators(symbols) that can be overloaded -> https://kotlinlang.org/docs/operator-overloading.html
operator infix fun Animal.plus(a: Animal): Animal // Alien.plus--> Extension function, "plus" function belongs to Alien class
{
    var newAnimal =Animal()
    newAnimal.str = this.str + " " + a.str // this --> refers to the current object
    return newAnimal
}

