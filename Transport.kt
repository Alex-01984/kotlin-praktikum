interface Moveable {
    fun move()
}

interface PassengerCarrier {
    fun loadPassenger()

    fun unloadPassenger()
}

interface CargoCarrier {
    fun loadCargo()

    fun unloadCargo()
}

class Car : Moveable, PassengerCarrier {
    val maxPassengers = 3
    var currentPassengers = 0

    override fun move() = println("Легковой автомобиль едет по дороге.")

    override fun loadPassenger() {
        if (currentPassengers < maxPassengers) {
            currentPassengers++
            println("Пассажир сел в машину. Всего пассажиров: $currentPassengers")
        } else {
            println("В машине нет свободных мест!")
        }
    }

    override fun unloadPassenger() {
        if (currentPassengers > 0) {
            currentPassengers--
            println("Пассажир вышел из машины. Всего пассажиров: $currentPassengers")
        } else {
            println("В машине нет пассажиров!")
        }
    }
}

class Truck : Moveable, PassengerCarrier, CargoCarrier {
    val maxPassengers = 1
    var currentPassengers = 0
    val maxCargo = 2
    var currentCargo = 0

    override fun move() = println("Грузовик трогается с места.")

    override fun loadPassenger() {
        if (currentPassengers < maxPassengers) {
            currentPassengers++
            println("Пассажир сел в кабину. Всего пассажиров: $currentPassengers")
        } else {
            println("В машине нет свободных мест!")
        }
    }

    override fun unloadPassenger() {
        if (currentPassengers > 0) {
            currentPassengers--
            println("Пассажир вышел из кабины. Всего пассажиров: $currentPassengers")
        } else {
            println("В кабине нет пассажиров!")
        }
    }

    override fun loadCargo() {
        if (currentCargo < maxCargo) {
            currentCargo++
            println("Загружена 1 тонна груза. Всего: $currentCargo т.")
        } else {
            println("Грузовик полностью загружен (макс. 2 тонны)!")
        }
    }

    override fun unloadCargo() {
        if (currentCargo > 0) {
            currentCargo--
            println("Разгружена 1 тонна. Осталось: $currentCargo т.")
        } else {
            println("Грузовик уже пуст!")
        }
    }
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
