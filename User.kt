class User(initialLogin: String, initialPassword: String) {
    var login: String = initialLogin
        set(value) {
            println("Логин успешно изменен на $value")
            field = value
        }
    var password: String = initialPassword
        set(value) {
            println("Вы не можете изменить пароль")
        }
        get() {
            var stars = ""
            field.forEach { stars += "*" }
            return stars
        }
}

fun main() {
    val user1 = User("user", "123")
    println("Имя польльзователя ${user1.login} пароль: ${user1.password}")
    user1.login = "admin"
    println("Имя польльзователя ${user1.login} пароль: ${user1.password}")
    user1.password = "123456"
    println("Попытка изменить пароль. Текущий пароль в системе: ${user1.password}")
}
