const val WEIGHT_MIN = 35
const val WEIGHT_MAX = 100
const val VOLUME_MAX = 100

fun main() {
    val weight1 = 20
    val volume1 = 80
    println(
            "Груз с весом $weight1 кг и объемом $volume1 л соответствует категории 'Average': ${weight1 > WEIGHT_MIN && weight1 <= WEIGHT_MAX && volume1 < VOLUME_MAX}"
    )

    val weight2 = 50
    val volume2 = 100
    println(
            "Груз с весом $weight2 кг и объемом $volume2 л соответствует категории 'Average': ${weight2 > WEIGHT_MIN && weight2 <= WEIGHT_MAX && volume2 < VOLUME_MAX}"
    )
}
