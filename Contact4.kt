class Contact4(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printInfo() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val personList = mutableListOf<Contact4>()

    while (true) {
        print("Введите имя: ")
        val nameInput = readlnOrNull() ?: break
        if (nameInput.lowercase() == "exit") break

        print("Введите номер телефона: ")
        val phoneInput = readlnOrNull()!!

        val phoneNumber = phoneInput.toLongOrNull()
        if (phoneNumber == null) {
            println("Номер телефона не введён или некорректен. Запись не добавлена.\n")
            continue
        }

        print("Введите название компании: ")
        val rawCompany = readlnOrNull()
        val companyInput = if (rawCompany != null && rawCompany.isNotEmpty()) rawCompany else null

        personList.add(Contact4(nameInput, phoneNumber, companyInput))
    }

    println("\nСписок контактов:")
    personList.forEach { it.printInfo() }
}
