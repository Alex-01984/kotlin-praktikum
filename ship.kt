// Константы для пороговых значений (убираем «магические числа»)
const val MIN_CREW = 55
const val MAX_CREW = 70
const val MAX_RECOMMENDED_CREW = 70
const val MIN_PROVISIONS_STRICT = 50 // > 50 для первого сценария
const val MIN_PROVISIONS_ALTERNATIVE = 50 // >= 50 для второго сценария

fun main() {
    println("Введите данные для проверки возможности отплытия:")

    // Используем readln() — не требует обработки null, код чище
    print("Повреждения корпуса (true = нет, false = есть): ")
    val noDamage = readln().toBoolean()

    print("Численность экипажа (человек): ")
    val crewSize = readln().toInt()

    print("Количество ящиков с провизией: ")
    val provisions = readln().toInt()

    print("Благоприятная погода (true/false): ")
    val goodWeather = readln().toBoolean()

    // Единое составное условие (только логические операторы)
    val canSail =
            (noDamage &&
                    crewSize >= MIN_CREW &&
                    crewSize <= MAX_CREW &&
                    provisions > MIN_PROVISIONS_STRICT) ||
                    (!noDamage &&
                            crewSize == MAX_RECOMMENDED_CREW &&
                            goodWeather &&
                            provisions >= MIN_PROVISIONS_ALTERNATIVE)

    println("Корабль может отправиться в плавание: $canSail")
}
