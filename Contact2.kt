class Contact2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun infoContact() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val person = Contact2("Ростислав", 89123456789, "Reddit")
    person.infoContact()

    val person2 = Contact2("Ростислав", 89123456789)
    person2.infoContact()
}
