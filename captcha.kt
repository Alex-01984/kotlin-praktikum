fun main() {
    for (attempt in 1..3) {
        val num1 = (1..9).random()
        val num2 = (1..9).random()

        print("Попытка $attempt. Подтвердите, что вы не робот: $num1 + $num2 = ")

        if (readln().toIntOrNull() == num1 + num2) {
            println("Добро пожаловать!")
            return
        }
    }
    println("Доступ запрещён")
}
