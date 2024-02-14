@file:JvmName("First")  //To rename the class file name
fun main() {
    var result = add(4, 5)
    println(result)

    var subr = sub(10, 4)
    println(subr)

    var maxi = max(10, 4)
    println(maxi)
}

// Normal Function
fun add(a: Int, b: Int): Int // specify return type
{
    return a + b
}

// Inline Function that returns the value directly instead of providing return
fun sub(c: Int, d: Int): Int = c - d

fun max(a: Int, b: Int): Int = if (a > b) a else b  // if else expression in Single line
//{
//    if(a>b)
//        return a
//    else
//        return b
//}