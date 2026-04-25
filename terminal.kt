// Предварительно заданные параметры категории "Average"
const val WEIGHT_MIN = 35 // не включительно
const val WEIGHT_MAX = 100 // включительно
const val VOLUME_MAX = 100 // не включительно

fun main() {
    // 1-й груз: 20 кг / 80 л
    val weight1 = 20
    val volume1 = 80
    println(
            "Груз с весом $weight1 кг и объемом $volume1 л соответствует категории 'Average': ${weight1 > WEIGHT_MIN && weight1 <= WEIGHT_MAX && volume1 < VOLUME_MAX}"
    )

    // 2-й груз: 50 кг / 100 л
    val weight2 = 50
    val volume2 = 100
    println(
            "Груз с весом $weight2 кг и объемом $volume2 л соответствует категории 'Average': ${weight2 > WEIGHT_MIN && weight2 <= WEIGHT_MAX && volume2 < VOLUME_MAX}"
    )
}
