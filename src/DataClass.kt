//Data Class --> same as normal class only advantage is by default it has the below 3 points

// 1. Every class needs a toString()
// 2. equals & hashCode --> Overridden
// 3. achieve cloning --> copy method
data class Laptop(val brand: String, val price: Int) { //use data keyword to the above 3 points
    fun show() {
        println("Nice Laptop")
    }
}

fun main() {
    var lap1 = Laptop("Dell", 2000)
    var lap2 = Laptop("Dell", 2000)

    var lap3 = lap1.copy(price=2200) // You can change only one value and copy another one from lap1

    //  println(lap1) //solve this using toString() method
    // When we print a reference directly O/p: Hash code Laptop@6e0be858 --> Gives an address and class name with it

    //println(lap1==lap2) // O/p:false --> same output for equals also before using "data" keyword

    println(lap1.equals(lap2)) // O/p:true

    println(lap3) // Laptop(brand=Dell, price=2000)


}