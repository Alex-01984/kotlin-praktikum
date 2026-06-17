const val PASSWORD_SIZE = 6

fun main() {
    val letters = 'a'..'z' // CharRange вместо строки
    val digits = 0..9 // IntRange вместо строки
    var password = ""

    for (i in 1..PASSWORD_SIZE) {
        if (i % 2 == 1) {
            // Нечётные позиции (1, 3, 5) → буква
            password += letters.random()
        } else {
            // Чётные позиции (2, 4, 6) → цифра
            password += digits.random().toString()
        }
    }

    println(password)
}
