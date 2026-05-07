// 1. Креды в константах (неизменяемы, инициализированы заранее)
const val VALID_LOGIN = "admin"
const val VALID_PASSWORD = "1234"

// 2. Метод авторизации: принимает данные, проверяет, возвращает токен или null
fun authorize(login: String, password: String): String? {
    if (login == VALID_LOGIN && password == VALID_PASSWORD) {
        return buildString {
            val chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
            repeat(32) { append(chars.random()) }
        }
    }
    return null
}

// 3. Метод получения корзины: принимает токен, возвращает список или null
fun getShoppingCart(token: String?): List<String>? {
    if (token.isNullOrBlank()) return null
    return listOf("Ноутбук", "Смартфон", "Наушники", "Клавиатура")
}

fun main() {
    print("Введите логин: ")
    val login = readln()
    print("Введите пароль: ")
    val password = readln()

    // Цепочка вызовов
    val token = authorize(login, password)
    val cart = getShoppingCart(token)

    // Обработка результата в main
    if (cart != null) {
        println("Содержимое корзины: ${cart.joinToString(", ")}")
    } else {
        println("Неудачная авторизация. Доступ к корзине запрещен.")
    }
}
