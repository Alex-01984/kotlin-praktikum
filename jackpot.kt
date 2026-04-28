fun main() {
    // Загаданные числа хранятся в списке
    val winNum1 = (0..42).random()
    val winNum2 = (0..42).random()
    val winNum3 = (0..42).random()
    val winningNumbers = listOf(winNum1, winNum2, winNum3)

    print("Введите первое число (0–42): ")
    val guess1 = readln().toInt()
    print("Введите второе число (0–42): ")
    val guess2 = readln().toInt()
    print("Введите третье число (0–42): ")
    val guess3 = readln().toInt()
    val guessedNumbers = listOf(guess1, guess2, guess3)

    // Находим пересечение и сохраняем размер в отдельную переменную
    val matches = winningNumbers.intersect(guessedNumbers)
    val matchCount = matches.size

    // Определяем результат
    when (matchCount) {
        3 -> println("Вы угадали все числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз!")
        else -> println("Вы не угадали ни одного числа.")
    }
    // В конце всегда выводим выигрышные числа
    println("Выигрышные числа: $winningNumbers")
}
