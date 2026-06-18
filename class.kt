// Класс вынесен за пределы main() и использует первичный конструктор
class User(
        val id: Int,
        val login: String,
        val password: String,
        val email: String,
)

fun main() {
    //  Данные передаются сразу при создании объектов
    val person1 = User(1, "admin", "123", "person1@yandex.ru")
    val person2 = User(2, "user", "456", "person2@yandex.ru")

    println(
            "ID: ${person1.id}, Логин: ${person1.login}, Пароль: ${person1.password}, Почта: ${person1.email}"
    )
    println(
            "ID: ${person2.id}, Логин: ${person2.login}, Пароль: ${person2.password}, Почта: ${person2.email}"
    )
}
