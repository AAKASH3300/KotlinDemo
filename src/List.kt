fun main(){
    var nums = listOf(1,2,3,4) //Read-only List
    nums.count()
    for ((i,e) in nums.withIndex()){  //withIndex() --> to print the index along with values
        println("$i : $e")
    }
    println("------------------------------")

    var num = mutableListOf(10,12,20,30) //Mutable List
    num.add(11)
    num.remove(12)
    println( num.first())
    println(num.last())
    println("The element at 2nd index is ${num[2]}")

    for(j in num)
        println(j)
}