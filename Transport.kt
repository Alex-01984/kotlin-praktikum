interface Movable {
    fun move()
}

interface PassengerCarrier {
    val maxPassengers: Int
    var currentPassengers: Int

    fun loadPassenger() {
        if (currentPassengers < maxPassengers) {
            currentPassengers++
            println("Пассажир сел в машину. Всего пассажиров: $currentPassengers")
        } else {
            println("В машине нет свободных мест!")
        }
    }

    fun unloadPassenger() {
        if (currentPassengers > 0) {
            currentPassengers--
            println("Пассажир вышел из машины. Всего пассажиров: $currentPassengers")
        } else {
            println("В машине нет пассажиров!")
        }
    }
}

interface CargoCarrier {
    val maxCargo: Int
    var currentCargo: Int

    fun loadCargo() {
        if (currentCargo < maxCargo) {
            currentCargo++
            println("Загружена 1 тонна груза. Всего: $currentCargo т.")
        } else {
            println("Грузовик полностью загружен (макс. 2 тонны)!")
        }
    }

    fun unloadCargo() {
        if (currentCargo > 0) {
            currentCargo--
            println("Разгружена 1 тонна. Осталось: $currentCargo т.")
        } else {
            println("Грузовик уже пуст!")
        }
    }
}

class Car : Movable, PassengerCarrier {
    override val maxPassengers = 3
    override var currentPassengers = 0

    override fun move() = println("Легковой автомобиль едет по дороге.")
}

class Truck : Movable, PassengerCarrier, CargoCarrier {
    override val maxPassengers = 1
    override var currentPassengers = 0
    override val maxCargo = 2
    override var currentCargo = 0

    override fun move() = println("Грузовик трогается с места.")
}

fun main() {
    val car1 = Car()
    repeat(3) {
        car1.loadPassenger()
    }
    val car2 = Car()
    repeat(3) {
        car2.loadPassenger()
    }
    car1.move()
    car2.move()
    repeat(3) {
        car1.unloadPassenger()
    }
    repeat(3) {
        car2.unloadPassenger()
    }
    val truck = Truck()
    repeat(2) {
        truck.loadCargo()
    }
    truck.move()
    repeat(2) {
        truck.unloadCargo()
    }
}
