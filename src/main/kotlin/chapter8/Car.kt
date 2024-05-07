package chapter8

class Car : Vehicle() {
    override fun start() {
//        super.start()
        println("I'm riding")
    }
}

fun startAndStop(vehicle: Vehicle) {
    vehicle.start()
    vehicle.stop()
}

fun main() {
//    val car = Car()
//    car.start()

    startAndStop(Car())
}