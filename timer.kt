fun main() {
    print("Введите количество секунд, которые нужно засечь: ")
    val time = readln().toInt()

    for (sec in time downTo 1) {
        println("До конца осталось: $sec сек.")
        Thread.sleep(1000L)
    }

    println("Время вышло")
}
