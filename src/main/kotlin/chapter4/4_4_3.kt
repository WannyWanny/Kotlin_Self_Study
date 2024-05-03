package chapter4

/**
 * 코틀린은 명시적인 선언 없이 객체를 바로 생성할수 있는 객체 식을 제공한다.
 * 자바의 익명 클래스와 아주 비슷하다.
 */
fun main() {
    fun midPoint(xRange: IntRange, yRange: IntRange) = object {
        val x = (xRange.first + xRange.last)/2
        val y = (yRange.first + yRange.last)/2

    }

    val midPoint = midPoint(1..5, 2..6)
    println("${midPoint.x}, ${midPoint.y}")
}