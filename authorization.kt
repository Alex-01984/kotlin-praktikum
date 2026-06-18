const val VALID_LOGIN = "admin"
const val VALID_PASSWORD = "1234"

// 1. Метод авторизации: проверяет креды, возвращает токен или null
fun authorize(login: String, password: String): String? {
    if (login == VALID_LOGIN && password == VALID_PASSWORD) {
        return buildString {
            val chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
            repeat(32) { append(chars.random()) }
        }
    }
    return null
}

// 2. Метод корзины: принимает НЕ нулевой токен, возвращает список
fun getShoppingCart(token: String): List<String> {
    // Логика работы с токеном (проверка, логирование и т.д.) может быть здесь.
    // Для учебной задачи просто возвращаем заранее созданный список.
    return listOf("Ноутбук", "Смартфон", "Наушники", "Клавиатура")
}

fun main() {
    print("Введите логин: ")
    val login = readln()
    print("Введите пароль: ")
    val password = readln()

    // 3. Проверка авторизации сразу после вызова (как просил ментор)
    val token = authorize(login, password)

    if (token == null) {
        println("Неудачная авторизация. Доступ к корзине запрещен.")
    } else {
        // Передаём гарантированно валидный токен
        val cart = getShoppingCart(token)
        println("Содержимое корзины: ${cart.joinToString(", ")}")
    }
}
