fun main() {
    var attempt = 1 // Начинаем с 1, чтобы нумерация была понятной

    do {
        val num1 = (1..9).random()
        val num2 = (1..9).random()

        // Выводим номер попытки как есть (1, 2, 3)
        print("Попытка $attempt. Подтвердите, что вы не робот: $num1 + $num2 = ")

        if (readln().toInt() == num1 + num2) {
            println("Добро пожаловать!")
            return
        }

        attempt++ // Увеличиваем счётчик
    } while (attempt <= 3) // Повторяем, пока попыток не больше 3

    println("Доступ запрещён")
}
