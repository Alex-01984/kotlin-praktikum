// Валидация вынесена в отдельную функцию
fun isValidCredentials(login: String, password: String): Boolean =
        login.length >= 4 && password.length >= 4

fun main() {
    print("Введите логин: ")
    val login = readln()
    print("Введите пароль: ")
    val password = readln()

    if (isValidCredentials(login, password)) {
        println("Добро пожаловать!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}
