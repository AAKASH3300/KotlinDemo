data class Book(var name: String, var price: Int) // Book can have multiple object because we have multiple books

//Object keyword allows to create only one object and Bookshelf(class name) is the object name
object BookShelf
// Bookshelf must have only one object i.e. we are trying to create a singleton object
{
    var books = arrayListOf<Book>()

    fun showBooks() {
        for (i in books) {
            println(i)
        }
    }
}

fun main() {
    BookShelf.books.add(Book("Java", 50))
    BookShelf.books.add(Book("Kotlin", 80))
    BookShelf.books.add(Book("Sql", 40))

    BookShelf.showBooks()
}