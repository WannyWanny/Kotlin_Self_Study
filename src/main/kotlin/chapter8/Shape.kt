package chapter8

import kotlin.math.PI

abstract class Shape {
    abstract val width: Double
    abstract val height: Double
    abstract fun area(): Double
}

class Circle(val radius: Double): Shape() {
    val diameter get() = 2*radius
    override val width get() = diameter
    override val height get() = diameter
    override fun area(): Double {
        return PI*radius*radius
    }
}

class Rectangle(
    override val width: Double,
    override val height: Double
): Shape() {
    override fun area() = width*height
}