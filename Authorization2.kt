fun main() {
    // 1. Этап регистрации
    println("=== Регистрация ===")
    print("Придумайте логин: ")
    val regLogin = readln()
    print("Придумайте пароль: ")
    val regPassword = readln()

    // 2. Этап авторизации
    println("\n=== Авторизация ===")
    do {
        print("Введите логин: ")
        val inputLogin = readln()
        print("Введите пароль: ")
        val inputPassword = readln()

        if (inputLogin != regLogin || inputPassword != regPassword) {
            println("Неверные логин или пароль. Попробуйте снова.")
        }
    } while (inputLogin != regLogin || inputPassword != regPassword)

    println("Авторизация прошла успешно")
}
