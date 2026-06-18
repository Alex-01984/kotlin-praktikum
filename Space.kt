class SpaceShip(val name: String) {
    fun launch() {
        TODO("need info about additional logic")
    }

    fun land() {
        throw NotImplementedError()
    }

    fun dodgeAsteroid() {
    }
}

fun main() {
    val star = SpaceShip("Аполлон")
    star.launch()
    star.land()
    star.dodgeAsteroid()
}
