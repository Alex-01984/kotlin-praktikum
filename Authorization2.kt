fun main() {
    // 1. Этап регистрации
    println("=== Регистрация ===")
    print("Придумайте логин: ")
    val regLogin = readln()
    print("Придумайте пароль: ")
    val regPassword = readln()

    // 2. Этап авторизации
    println("\n=== Авторизация ===")
    var inputLogin = ""
    var inputPassword = ""

    do {
        print("Введите логин: ")
        inputLogin = readln()
        print("Введите пароль: ")
        inputPassword = readln()

        if (inputLogin != regLogin || inputPassword != regPassword) {
            println("Неверные логин или пароль. Попробуйте снова.")
        }
    } while (inputLogin != regLogin || inputPassword != regPassword)

    println("Авторизация прошла успешно")
}
