class Contact3(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printInfo() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val personList =
        listOf(
            Contact3("Ростислав", 89123456789, "Reddit"),
            Contact3("Надежда", 89123456888, "Reddit2"),
            Contact3("Екатерина", 89123456999),
            Contact3("Анастасия", 89123456000),
            Contact3("Анастасия", 89123456000, "null"),
        )

    val companies = personList.mapNotNull { it.company }
    println(companies.joinToString(", "))
}
