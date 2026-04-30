fun main() {
    print("Введите число: ")
    val limit = readln().toInt()

    for (i in 0..limit step 2) {
        print("$i ")
    }
}
