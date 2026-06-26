data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: String,
    val distance: Double,
)

fun main() {
    val alphaCentauri =
        GalacticGuide(
            "Alpha Centauri",
            "Ближайшая к Солнцу звездная система",
            "2026-06-25 18:00",
            4.37,
        )
    val firstComponent = alphaCentauri.component1()
    val secondComponent = alphaCentauri.component2()
    val thirdComponent = alphaCentauri.component3()
    val fourthComponent = alphaCentauri.component4()

    println("Название: $firstComponent")
    println("Описание: $secondComponent")
    println("Дата и время: $thirdComponent")
    println("Расстояние: $fourthComponent")
}
