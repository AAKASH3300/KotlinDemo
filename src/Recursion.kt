import java.math.BigInteger

//Recursion
//A function that calls itself is called as recursion
//Factorial
fun main() {
    var num = BigInteger("70") // 70000 - StackOverflowError
//    var fact = 1
//    for ( i in 1..num) // normal for loop
//    {
//        fact = fact * i
//    }
    println(factorial(num))
}

fun factorial(num: BigInteger): BigInteger  // BigInteger --> we are dealing with bigger numbers,so we move to BigInteger
{
    if (num == BigInteger.ZERO)
        return BigInteger.ONE
    else
        return num * factorial(num - BigInteger.ONE)  // 5*4! -> 4*3! .... = 120
}

// 5*4! -> 4*3! each time a stack is created and the frame is going up
// when 4*3! is executed 5*4! is still present in the stack
// If we can solve this by performing the computational at the same time --> using Tail Recursion
