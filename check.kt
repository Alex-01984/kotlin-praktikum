const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2026

fun main() {
    print("Введите ваш год рождения: ")
    val yearOfBirth = readln().toIntOrNull() ?: 0

    if (CURRENT_YEAR - yearOfBirth >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Запретить экран со скрытым контентом")
    }
}
