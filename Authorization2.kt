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
    var isAuthorized = false

    do {
        print("Введите логин: ")
        inputLogin = readln()
        print("Введите пароль: ")
        inputPassword = readln()

        // Вычисляем результат СРАВНЕНИЯ ОДИН РАЗ
        isAuthorized = inputLogin == regLogin && inputPassword == regPassword

        // Сообщаем об ошибке только если авторизация не прошла
        if (!isAuthorized) {
            println("Неверные логин или пароль. Попробуйте снова.")
        }
    } while (!isAuthorized)

    println("Авторизация прошла успешно")
}
