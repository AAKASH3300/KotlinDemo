//Arrays
fun main() {
    var marks = intArrayOf(99, 87, 75, 85)

    // marks[1] = 88 // using index operator [] change element
    marks.set(1, 89) //with set() method instead of []

    // println(marks) // O/p:[I@135fbaa4 Hashcode of the array
    for (i in marks) // print array elements
        println(i)
    println("------------------------------")

    // print specific value
    // println(marks[3]) // using index operator []
    println("Third Index Element : ")
    println(marks.get(3)) // with get() method instead of []
    println("Size of Array :")
    println( marks.size) // prints size of the array

    println("------------------------------")

    //If we don't know the Array values
    var avg = IntArray(5)//specify array size
    avg.set(0,10)
    avg.set(1,11)
    avg.set(2,12)
    avg.set(3,13)
    avg.set(4,14)

    for (i in avg)
        println(i)

    println("------------------------------")

    println("String Array :")
    var places = arrayOfNulls<String>(3)
    places.set(0,"Udt")
    places.set(1,"Pollachi")
    places.set(2,"Cbe")

    for(j in places)
        println(j)


}