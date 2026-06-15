fun main() {
    print("Введите количество секунд: ")
    var seconds = readln().toLong() // одна переменная, сразу mutable

    while (seconds > 0) {
        println("Осталось секунд: $seconds")
        Thread.sleep(1000)
        seconds-- // уменьшаем ту же переменную
    }

    println("Время вышло")
}
