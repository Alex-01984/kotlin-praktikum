// Константы для индексов (compile-time constants)
const val EGG_INDEX = 0
const val MILK_INDEX = 1
const val BUTTER_INDEX = 2

val BASE_AMOUNTS = listOf(2, 50, 15)

fun main() {
    println(
            "Список ингредиентов для одной порции: Яиц – ${BASE_AMOUNTS[EGG_INDEX]} шт, " +
                    "молока – ${BASE_AMOUNTS[MILK_INDEX]} мл, " +
                    "сливочного масла – ${BASE_AMOUNTS[BUTTER_INDEX]} гр"
    )

    print("Введите количество порций: ")
    val portions = readln().toInt()

    // Модернизируем список: создаём новый с пересчитанными значениями
    val scaledIngredients = BASE_AMOUNTS.map { it * portions }

    // Вывод результата
    println(
            "На $portions порций вам понадобится: Яиц – ${scaledIngredients[EGG_INDEX]} шт, " +
                    "молока – ${scaledIngredients[MILK_INDEX]} мл, " +
                    "сливочного масла – ${scaledIngredients[BUTTER_INDEX]} гр"
    )
}
