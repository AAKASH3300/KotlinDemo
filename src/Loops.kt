fun main() {
    var nums = 1..10  // range

    // for loop in Kotlin has some changes
    // (a in nums)-->similar to for each
    // (step)-->for increment
    for (a in nums step 2) {
        println(a)
    }

    // var num = 16 .. 1 // wrong
    var num = 16 downTo 1 // used to decrement and print values
    for (b in num) {
        println(b)
    }

    var dig = 1 until 16 // until --> prints till 15,and it will not take 16
    for (b in dig.reversed()) {  //reversed()--> prints the values in reverse
        println(b)
    }

    var letter = 'A'..'z' // Range from A to z
    for (c in letter) {
        println(c)
    }
    println(letter.count())
}