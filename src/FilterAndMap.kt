// Filter and Map

fun main() {
    var nums = listOf(1,2,3,4,5,6)

    // want to print even values
    var even = nums.filter { it % 2 == 0 } // filters even numbers from the list
    even.forEach({ println(it) })

    // want to double the values
    var doubleVal = even.map {it*2} //map will take the value and convert it into another value
   doubleVal.forEach({ println(it) })

    // apply both in the same line
    var results = nums
                    .filter { it%2!=0 }
                    .map { it*2 }

    results.forEach({ println(it) })
}