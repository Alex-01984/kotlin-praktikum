class Order(val orderNumber: Int, private var status: OrderStatus) {
    private fun updateStatus(newStatus: OrderStatus) {
        status = newStatus
    }

    fun requestStatusChange(newStatus: OrderStatus) {
        println("Отправка заявки менеджеру на изменение статуса на $newStatus")
        updateStatus(newStatus)
    }
}

enum class OrderStatus {
    NEW,
    IN_PROGRESS,
    READY,
}

fun main() {
    val order1 = Order(101, OrderStatus.NEW)
    order1.requestStatusChange(OrderStatus.IN_PROGRESS)
}
