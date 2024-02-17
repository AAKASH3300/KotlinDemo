//List in kotlin supports complex Objects as well
// float,string,...etc

data class Avengers(var name : String,var rank : Int) // It can be any class not only data class
fun main()
{
    var values = listOf<Avengers>(Avengers("Hulk",2),Avengers("IronMan",1))

    for (avg in values) {
        println(avg)
        println(avg.name) // it can print individually also
    }
}
