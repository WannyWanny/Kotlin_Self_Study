package chapter3

import java.lang.Math.PI

// 함수 파라미터는 불변이므로 radius++를 수행하면 오류 발행
fun circleArea(radius: Double): Double {
    return PI * radius * radius
//    Val cannot be assigned
//    radius += 5;
//    return PI*radius;
}

fun main() {
    print("Enter radius: ")
    val radius = readLine()!!.toDouble()
    print("Circle Area: ${circleArea(radius)}")
}


/**
 * fun prompt(name: String) {
println("***** Hello, $name")
}

fun prompt(name: String): Unit {
println("***** Hello, $name")
}

 두 함수는 동일하다. 코틀린은 기본적으로 반환값을 명시해야 하지만 자바의 void라 볼수있는 Unit을 사용하면 동등하다고 판단한다.
 */

/**
 * 코틀린은 named argument 방식도 제공한다.
 * rectangleArea(width = w, height = h)
 * rectangleArea(height = h, width = w)
 */

/**
 * 디폴트 파라미터를 통해 오버로딩을 사용하지 않을 수도 있다.
 * fun readInt(radius: Int = 10) = readLine()!!.toInt(radius)
 *
 * 인자없이 호출해도 되고, 지정해서 호출해도 되고
 * val decimalInt = readInt()
 * val decimalInt2 = readInt(10)
 * val hexInt = readInt(16)
 */