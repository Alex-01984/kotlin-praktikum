enum class AmmoType(val damage: Int, val displayName: String) {
    BLUE(5, "синий"),
    GREEN(10, "зелёный"),
    RED(20, "красный"),
}

class Tank {
    var currentAmmo: AmmoType? = null

    fun equip(ammoType: AmmoType) {
        currentAmmo = ammoType
        println("Танк вооружён патроном типа: ${ammoType.displayName}")
    }

    fun shoot() {
        if (currentAmmo != null) {
            println("Танк выстрел! нанес урон: ${currentAmmo?.damage} единиц")
        } else {
            println("Танк не заряжен")
        }
    }
}

fun main() {
    val tank = Tank()
    tank.shoot()
    tank.equip(AmmoType.BLUE)
    tank.shoot()
    tank.equip(AmmoType.GREEN)
    tank.shoot()
    tank.equip(AmmoType.RED)
    tank.shoot()
}
