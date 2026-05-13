class Contact5(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
)

fun main() {
    val personList = mutableListOf<Contact5>()

    while (true) {
        print("Введите имя: ")
        val nameInput = readln()
        if (nameInput.lowercase() == "exit") break

        print("Введите номер телефона: ")
        val phoneInput = readln()
        val phoneNumber: Long

        try {
            phoneNumber = phoneInput.toLong()
        } catch (e: NumberFormatException) {
            println("Ошибка: ${e::class.simpleName}")
            continue
        }

        print("Введите название компании: ")
        val companyInput = readln().ifEmpty { null }

        personList.add(Contact5(nameInput, phoneNumber, companyInput))
    }

    println("\nСписок контактов:")
    personList.forEach {
        println("Имя: ${it.name}\nНомер: ${it.phoneNumber}\nКомпания: ${it.company ?: "<не указано>"}")
    }
}
