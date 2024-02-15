class Animal {
    var name: String = ""
    //val name : String = ""; // Error : Val cannot be reassigned

    //var str : String = null //Error --> Null can not be a value of a non-null type String
    // Kotlin by default doesn't support Null values preventing NullPointerException
    var str: String? = null // ? --> Qn mark allows to use null values for that variable
    fun show() {
        println(str)
    }
}