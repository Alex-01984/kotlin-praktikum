fun generatePassword(length: Int): String = buildString {
    val digits = "0123456789"
    val specials = "!\"#$%&'()*+,-./ "

    for (i in 0 until length) {
        if (i % 2 == 0) {
            append(digits.random()) // Чётные позиции: цифра
        } else {
            append(specials.random()) // Нечётные позиции: спецсимвол
        }
    }
}

fun main() {
    print("Введите количество символов пароля: ")
    val length = readln().toInt()
    println(generatePassword(length))
}
