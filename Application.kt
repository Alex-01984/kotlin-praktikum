data class MainScreenState(val data: String, val isLoading: Boolean = false)

class MainScreenViewModel() {
    var mainScreenState = MainScreenState("")

    fun loadData() {
        println("Начальное состояние: $mainScreenState")
        mainScreenState = mainScreenState.copy(isLoading = true)
        println("Новое состояние: $mainScreenState")
        mainScreenState = mainScreenState.copy("Данные с сервера", isLoading = false)
        println("Данные после загрузки с сервера : $mainScreenState")
    }
}
fun main() {
    val model = MainScreenViewModel()
    model.loadData()
}
