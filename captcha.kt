fun main() {
    var attempt = 1

    do {
        val num1 = (1..9).random()
        val num2 = (1..9).random()

        print("Попытка $attempt. Подтвердите, что вы не робот: $num1 + $num2 = ")
        if (readln().toInt() == num1 + num2) {
            println("Добро пожаловать!")
            return
        }
        attempt++
    } while (attempt <= 3)
    println("Доступ запрещён")
}
