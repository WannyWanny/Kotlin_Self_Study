package chapter2

import java.util.*

fun main() {
    //코틀린도 String은 불변이다.

    val name = readLine()
    println("Hello, $name! \n Today is ${Date()}")

    /**
     * 자바의 ==는 참조 동등성이다. 실제 문자열을 비교하려면 equals()를 사용하자
     * 코틀린은 ==가 문자열을 비교하는 equals()대신 사용 가능하다. 참조 동등성을 비교하고 싶다면 ===을 사용한다.
     */
}