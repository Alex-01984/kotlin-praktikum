enum class Gender(val displayName: String) {
    MALE("Мужской"),
    FEMALE("Женский"),
}

class Person(
    val name: String,
    val gender: Gender,
)

fun main() {
    println("=== Приложение 'Картотека' ===")
    println("Введите имя и пол в формате: Имя пол")
    println("Доступные значения пола: м (Мужской), ж (Женский)")
    println("Пример: Иван м")
    println("==============================\n")

    val people = mutableListOf<Person>()

    repeat(5) {
        println("Введите данные (человек ${it + 1} из 5):")
        val input = readln()
        val parts = input.split(" ")

        if (parts.size == 2) {
            val name = parts[0]
            val genderInput = parts[1]
            val gender =
                when (genderInput) {
                    "м" -> Gender.MALE
                    "ж" -> Gender.FEMALE
                    else -> {
                        println("Неверный пол! Используйте 'м' или 'ж'.")
                        return@repeat
                    }
                }

            val person = Person(name, gender)
            people.add(person)
            println("Добавлено: ${person.name} - ${person.gender.displayName}\n")
        } else {
            println("Неверный формат! Введите имя и пол через пробел.\n")
        }
    }
    println("\n=== Картотека ===")
    if (people.isEmpty()) {
        println("Картотека пуста.")
    } else {
        for (person in people) {
            println("${person.name} - ${person.gender.displayName}")
        }
    }
}
