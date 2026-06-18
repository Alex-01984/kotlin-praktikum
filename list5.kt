fun main() {
    println("Введите 5 ингредиентов (каждый по отдельности):")

    // 1. Компактный ввод: List(5) вызовет readln() ровно 5 раз
    val ingredients = List(5) { readln() }

    val result =
            ingredients
                    .toSet() // Исключаем повторы (Set физически не хранит дубликаты)
                    .sorted() // Сортируем по алфавиту
                    .joinToString(", ") // Собираем в одну строку через запятую
                    .replaceFirstChar {
                        it.uppercaseChar()
                    } // Заглавной становится ТОЛЬКО первая буква итоговой строки

    println(result)
}
