class RegularBook2(val title: String, val author: String)

data class DataBook2(val title: String, val author: String)

fun main() {
    val book = RegularBook2("Kotlin in Action", "Jemerov")
    val databook = DataBook2("Kotlin in Action", "Jemerov")

    // строковое представление объекта по умолчанию
    println(book)
    // для представления объекта используется переопределённая функция toString()
    println(databook)
}
