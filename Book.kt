class RegularBook(val title: String, val author: String)

data class DataBook(val title: String, val author: String)

fun main() {
    val book1 = RegularBook("Kotlin in Action", "Jemerov")
    val book2 = RegularBook("Kotlin in Action", "Jemerov")
    val dataBook1 = DataBook("Kotlin in Action", "Jemerov")
    val dataBook2 = DataBook("Kotlin in Action", "Jemerov")

    // одинаковые значения, разные объекты, выполняется сравнение по адресам объектов
    println(book1 == book2)
    // одинаковые значения, выполняется сравнение по по значениям объектов
    println(dataBook1 == dataBook2)
}
