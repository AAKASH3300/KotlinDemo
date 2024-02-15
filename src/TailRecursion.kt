//Tail Recursion
import java.math.BigInteger

fun main() {
    var num = BigInteger("70000") // 70000 - StackOverflowError
    println(facti(num, BigInteger.ONE))
}

tailrec fun facti(num: BigInteger, result: BigInteger): BigInteger {
    if (num == BigInteger.ZERO)
        return result
    else {
        return facti(num - BigInteger.ONE, num * result)
    }
}

//tailrec --> The keyword tells the compiler that the implementation of the function is required to be tail-recursive
//and optimizes the compilation