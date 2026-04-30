/*Создай программу, которая генерирует более сложные пароли.
пароль должен содержать цифры, строчные и заглавные буквы - должны присутствовать все три вида символов;
цифры и буквы должны располагаться в случайном порядке;
длина пароля должна задаваться пользователем;
минимальная длина пароля 6 символов. */
const val PASSWORD_SIZE = 6

fun main() {
    print("Введите длину пароля (минимум 6): ")
    val length = readln().toInt()

    if (length < 6) {
        println("Ошибка: минимальная длина пароля — 6 символов.")
        return
    }

    val lower = 'a'..'z'
    val upper = 'A'..'Z'
    val digits = '0'..'9'

    // 1. Гарантируем наличие всех трёх типов символов
    val passwordChars = mutableListOf(lower.random(), upper.random(), digits.random())

    // 2. Заполняем оставшиеся позиции случайными символами из общего набора
    val allChars = lower + upper + digits
    repeat(length - 3) { passwordChars.add(allChars.random()) }

    // 3. Перемешиваем, чтобы порядок стал случайным
    passwordChars.shuffle()

    // 4. Выводим результат
    println(passwordChars.joinToString(separator = ""))
}
