fun main() {
    print("Введите длину пароля (минимум 6): ")
    val lengthInput = readln().toIntOrNull()

    // 1. Безопасная обработка ввода: защита от букв, пустой строки и чисел < 6
    if (lengthInput == null || lengthInput < 6) {
        println("Ошибка: введите корректное целое число не менее 6.")
        return
    }
    val length = lengthInput

    val lower = 'a'..'z'
    val upper = 'A'..'Z'
    val digits = '0'..'9'

    // 2. Общий пул символов вынесен ДО создания списка, чтобы не пересоздаваться в цикле
    val allChars = lower + upper + digits

    // 3. Гарантируем наличие хотя бы одного символа каждого типа
    val passwordChars = mutableListOf(lower.random(), upper.random(), digits.random())

    // 4. Заполняем оставшиеся позиции
    repeat(length - 3) { passwordChars.add(allChars.random()) }

    // 5. Перемешиваем для случайного порядка
    passwordChars.shuffle()

    // 6. Выводим результат
    println(passwordChars.joinToString(separator = ""))
}
