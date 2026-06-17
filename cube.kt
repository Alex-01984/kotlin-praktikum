// 1. Генерация броска кубика
fun rollDice(): Int = (1..6).random()

// 2. Проведение раунда с объявлением победителя
fun playRound(): Boolean {
    print("Бросок пользователя: ")
    val user = rollDice()
    println("$user очков")

    print("Бросок компьютера: ")
    val computer = rollDice()
    println("$computer очков")

    return when {
        user > computer -> {
            println("🏆 Вы победили в этом раунде!")
            true
        }
        user < computer -> {
            println("💻 Компьютер победил в этом раунде.")
            false
        }
        else -> {
            println("🤝 Ничья в этом раунде!")
            false
        }
    }
}

fun shouldContinue(): Boolean {
    print("\nХотите бросить кости еще раз? Введите Да или Нет: ")
    return readln().equals("Да", ignoreCase = true)
}

fun main() {
    var wins = 0

    do {
        if (playRound()) wins++
    } while (shouldContinue())

    println("\nИгра завершена. Вы выиграли $wins раз(а).")
}
