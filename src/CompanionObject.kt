//Companion Object
//

class CompanionObject{
    companion object //static can be achieved in object and companion object only.
    {
        @JvmStatic // used to specify this is used in java and static method
        fun show()
        {
            println("Hello")
        }
    }
}

fun main(){
    CompanionObject.show()
}