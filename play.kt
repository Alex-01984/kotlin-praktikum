// Функция броска вынесена на верхний уровень
fun rollDice(): Int = (1..6).random()

fun main() {
    print("Бросок пользователя: ")
    val user = rollDice()
    println("$user очков")

    print("Бросок компьютера: ")
    val computer = rollDice()
    println("$computer очков")

    if (user == computer) {
        println("Победила дружба")
    } else if (user > computer) {
        println("Победило человечество")
    } else {
        println("Победила машина")
    }
}
