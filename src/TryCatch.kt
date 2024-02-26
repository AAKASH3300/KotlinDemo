fun main() {
    try {
        var d: Int
        print("Enter value of d :")
        d = readln()!!.toInt()
        var div: Int = 100 / d
        println("Div is : $div")
    } catch (e: Exception) {
        print(e.message)
    }

    println("App is Running")
}