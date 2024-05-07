package chapter8

open class FlyingVehicle : Vehicle() {
    fun takeOff() {
        println("Taking off")
    }

    fun land() {
        println("Landed")
    }
}