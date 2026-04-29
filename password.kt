/*Создай программу, которая генерирует шестизначные пароли. Пусть пароль будет состоять из чередующихся цифр и строчных букв латинского алфавита (без специальных символов). Например, k5p6m2. Выведи сгенерированный пароль в консоль. */
import kotlin.random.Random

fun main() {
    val letters = "abcdefghijklmnopqrstuvwxyz"
    val digits = "0123456789"
    var password = ""
    for (i in 1..6) {
        if (i % 2 == 1) {
            // Нечётные позиции (1, 3, 5) → буква
            password += letters[Random.nextInt(letters.length)]
        } else {
            // Чётные позиции (2, 4, 6) → цифра
            password += digits[Random.nextInt(digits.length)]
        }
    }
    println(password)
}
