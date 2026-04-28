fun main() {
    // 1. Этап регистрации: создаём учётные данные
    println("=== Регистрация ===")
    print("Придумайте логин: ")
    val regLogin = readln()
    print("Придумайте пароль: ")
    val regPassword = readln()

    // 2. Этап авторизации: проверяем введённые данные
    println("\n=== Авторизация ===")
    while (true) {
        print("Введите логин: ")
        val inputLogin = readln()
        print("Введите пароль: ")
        val inputPassword = readln()

        if (inputLogin == regLogin && inputPassword == regPassword) {
            println("Авторизация прошла успешно")
            break
        } else {
            println("Неверные логин или пароль. Попробуйте снова.")
        }
    }
}
