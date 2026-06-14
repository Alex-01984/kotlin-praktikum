class Player(val name: String, private var health: Int, private var attackPower: Int) {
    fun takeDamage(amount: Int) {
        if (health <= 0) {
            println("$name уже мертв и не может получать урон.")
            return
        }
        health -= amount
        if (health <= 0) {
            die()
            return
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
    hero.takeDamage(70) // Этот удар должен убить
    hero.heal(10) // Эта попытка лечения должна быть заблокирована
    hero.takeDamage(10) // Эта попытка получения урона тоже должна быть заблокирована
}
