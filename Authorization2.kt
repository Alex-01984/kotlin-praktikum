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
    } while ((inputLogin != regLogin || inputPassword != regPassword).also { incorrect ->
        if (incorrect) println("Неверные логин или пароль. Попробуйте снова.")
    })

    println("Авторизация прошла успешно")
}
