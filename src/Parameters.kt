@file:JvmName("Params")

fun main() {
    var finalAmt = calcAmount(50, 0.03)
    println(finalAmt)

    var Amt = calcAmount(interest = 0.03, amt = 50) //Named Parameters --> helps in code readability allows to pass parameters in any sequence
    println(Amt)
}

@JvmOverloads // Kotlin creates two methods: one method has amt as one parameter and another method with amt,interest two parameters
fun calcAmount(amt: Int, interest: Double = 0.04): Int { // interest: Double=0.04 --> Default parameters
    return (amt + amt * interest).toInt()  //toInt() --> convert double value into int
}