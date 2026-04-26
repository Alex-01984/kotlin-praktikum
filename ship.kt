fun main() {
    // Ввод данных с понятными подсказками
    println("Введите данные для проверки возможности отплытия:")

    print("Повреждения корпуса (true = нет, false = есть): ")
    val noDamage = readLine()?.toBoolean() ?: false

    print("Численность экипажа (человек): ")
    val crewSize = readLine()?.toIntOrNull() ?: 0

    print("Количество ящиков с провизией: ")
    val provisions = readLine()?.toIntOrNull() ?: 0

    print("Благоприятная погода (true/false): ")
    val goodWeather = readLine()?.toBoolean() ?: false

    // Единое составное условие (только логические операторы)
    val canSail =
            (noDamage && crewSize >= 55 && crewSize <= 70 && provisions > 50) ||
                    (!noDamage && crewSize == 70 && goodWeather && provisions >= 50)

    println("Корабль может отправиться в плавание: $canSail")
}
