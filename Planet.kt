open class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isSuitableForLanding: Boolean,
)

class Planet(
    val satellites: List<Satellite>,
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
) : CelestialBody(name, hasAtmosphere, isSuitableForLanding)

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
) : CelestialBody(name, hasAtmosphere, isSuitableForLanding)

fun main() {
    val satellite1 = Satellite("Rhea", false, false)
    val satellite2 = Satellite("Dione", false, false)
    val planet = Planet(listOf(satellite1, satellite2), "Saturn", false, false)

    println("Название планеты: ${planet.name}\nСпутники: ${planet.satellites.map { it.name }.joinToString()}")
}
