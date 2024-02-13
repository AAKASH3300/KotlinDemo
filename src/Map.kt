fun main() {
    //key--> String , value --> Int
    val juices = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100) // Map

    for ((i, e) in juices) {
        println(" $i : $e")
    }

    val juice: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100) // Mutable Map

    juice.put("mango", 150)

    for ((i, e) in juice) {
        println(" $i : $e")
    }

    println(juice.contains("kiwi"))
}