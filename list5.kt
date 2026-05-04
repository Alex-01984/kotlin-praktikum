fun main() {
    val ingredients = mutableListOf<String>()
    for (i in 1..5) {
        print("Введите ингредиент №$i: ")
        ingredients.add(readln())
    }

    // Цепочка обработки данных
    val result =
            ingredients
                    .distinct() // 1. Исключаем повторы (оставляет только уникальные)
                    .sorted() // 2. Сортируем по алфавиту
                    .map { ingredient ->
                        ingredient.replaceFirstChar { it.uppercaseChar() }
                    } // 3. Заглавная буква у каждого
                    .joinToString(", ") // 4. Собираем в одну строку через запятую

    println(result)
}
