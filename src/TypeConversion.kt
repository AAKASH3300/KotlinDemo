fun main() {
    var str: String = "4a"

    var num: Int = try{  //try as an expression
        str.toInt()
    }catch (e: NumberFormatException)
    {
        -1
    }

//    try {
//        num = str.toInt() // toInt() implements Integer.parseInt()
//    } catch (e: NumberFormatException) {
//        println("Give proper input")
//    }

    num++

    println(num)
}