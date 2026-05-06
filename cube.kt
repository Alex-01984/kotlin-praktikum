// 1. Генерация броска кубика
fun rollDice(): Int = (1..6).random()

// 2. Проведение одного раунда (возвращает true, если игрок выиграл)
fun playRound(): Boolean {
    print("Бросок пользователя: ")
    val user = rollDice()
    println("$user очков")

    print("Бросок компьютера: ")
    val computer = rollDice()
    println("$computer очков")

    return user > computer
}

fun main() {
    var wins = 0

    do {
        if (playRound()) {
            wins++
        }
        print("\nХотите бросить кости еще раз? Введите Да или Нет: ")
    } while (readln().equals("Да", ignoreCase = true))

    println("Игра завершена. Вы выиграли $wins раз(а).")
}
