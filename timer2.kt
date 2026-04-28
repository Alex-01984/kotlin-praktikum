fun main() {
    print("Введите количество секунд: ")
    val totalSeconds = readln().toLong() // исходное значение — неизменно
    var remaining = totalSeconds // счётчик — изменяемый

    while (remaining > 0) {
        println("Осталось секунд: $remaining")
        Thread.sleep(1000)
        remaining--
    }

    println("Время вышло")
}
