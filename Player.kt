class Player(val name: String, private var health: Int, private var attackPower: Int) {
    fun takeDamage(amount: Int) {
        health -= amount
        if (health <= 0) {
            die()
        }
        println("$name получил $amount урона. Текущее здоровье: $health")
    }

    fun heal(amount: Int) {
        if (health <= 0) {
            println("$name мертв и не может лечиться.")
            return
        }
        health += amount
        println("$name вылечился на $amount. Текущее здоровье: $health")
    }

    private fun die() {
        health = 0
        attackPower = 0
        println("$name умер. Сила удара и здоровье обнулены.")
    }
}

fun main() {
    val hero = Player("Stupid", 100, 25)
    hero.takeDamage(30)
    hero.heal(10)
    hero.takeDamage(20)
    hero.heal(5)
    hero.takeDamage(70)
    hero.heal(10)
}
