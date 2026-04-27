fun main() {
    // Генерируем числа для примера (можно вынести в константы при необходимости)
    val number1 = 10
    val number2 = 13
    val correctAnswer = number1 + number2

    // Выводим задание и считываем ответ
    print("Сложите два числа: $number1 + $number2 = ")
    val userInput = readln().toIntOrNull()

    // Проверяем ответ
    if (userInput == correctAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещён")
    }
}
