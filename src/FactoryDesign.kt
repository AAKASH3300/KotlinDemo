// Factory Design Pattern
// --> achieve it with the help of companion object

class FactoryDesign {
    companion object {
        // we are creating the object in this class itself
        // we are not creating it in main function
        fun create(): FactoryDesign = FactoryDesign()
    }

    fun disp() {
        println("in display")
    }
}

fun main() {
    var fac = FactoryDesign.create()
    fac.disp()
}