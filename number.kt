fun main() {
    val hiddenNumber = (1..9).random()

    for (attempt in 1..5) {
        print("Попытка $attempt. Введите число от 1 до 9: ")
        val userNumber = readln().toInt()

        if (userNumber == hiddenNumber) {
            println("Это была великолепная игра!")
            return
        } else {
            val remaining = 5 - attempt
            println("Неверно. Осталось попыток: $remaining")
        }
    }

    println("Было загадано число $hiddenNumber")
}
