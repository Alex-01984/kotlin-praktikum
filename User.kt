data class User(val name: String, val age: Int, val city: String)

fun main() {
    val person = User("Ekaterina", 50, "Moscow")
    val (name, age, city) = person

    println("Имя: $name\nВозраст: $age\nГород проживания: $city")
}
