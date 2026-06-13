class User(private val name: String, private val password: String) {
    fun checkPassword(valueCheck: String): Boolean {
        return valueCheck == password
    }
}

fun main() {
    val user = User("Ekaterina", "123")
    println("Введите пароль для проверки учетной записи.")
    val passValue = readln()
    if (user.checkPassword(passValue)) {
        println("Пароль корректный.")
    } else {
        println("Пароль некорректный.")
    }
}
