package chapter8

/**
 * open이 있어야 하위 클래스에서 상속이 가능하다.
 * 없다면 디폴트로 final클래스로 간주되어 상속이 불가능하다.
 */
open class Vehicle {
    var currentSpeed = 0

    open fun start() {
        println("I'm moving")
    }

    fun stop() {
        println("Stopped")
    }
}