class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    // 1. Вывод информации о пользователе
    fun printUserInfo() {
        println("ID: $id, Логин: $login, Пароль: $password, Почта: $email, BIO: $bio")
    }

    // 2. Считывание bio из консоли
    fun setBio() {
        print("Введите информацию о себе (bio): ")
        bio = readln()
    }

    // 3. Изменение пароля с проверкой
    fun changePassword() {
        print("Введите текущий пароль: ")
        val currentInput = readln()

        if (currentInput == password) {
            print("Введите новый пароль: ")
            password = readln()
            println("✅ Пароль успешно изменен!")
        } else {
            println("❌ Неверный пароль. Изменение отменено.")
        }
    }
}

fun main() {
    val person1 = User2(1, "admin", "123", "person1@yandex.ru")

    person1.setBio()
    person1.changePassword()
    person1.printUserInfo()
}
