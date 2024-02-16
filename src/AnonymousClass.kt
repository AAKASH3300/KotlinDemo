//Anonymous Inner Class
interface Hero
{
    fun action()
}

fun main()
{
    var hero : Hero = object : Hero //Anonymous Inner Class using Interface Object
                    {
                        override fun action() {
                            println("Save People")
                        }
                    }
    hero.action()
}

//object : Hero --> this instance can be used only once