fun main() {
    val winNum1 = (0..42).random()
    val winNum2 = (0..42).random()

    print("Введите первое число (0–42): ")
    val guess1 = readln().toInt()
    print("Введите второе число (0–42): ")
    val guess2 = readln().toInt()

    // Каждое введённое число проверяем на совпадение с ЛЮБЫМ выигрышным
    val match1 = guess1 == winNum1 || guess1 == winNum2
    val match2 = guess2 == winNum1 || guess2 == winNum2

    println("Для победы были нужны числа: $winNum1 и $winNum2")

    if (match1 && match2) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (match1 || match2) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
}
