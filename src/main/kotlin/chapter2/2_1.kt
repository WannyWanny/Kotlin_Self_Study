package chapter2

// 한줄짜리 주석
/**
 * 여러줄 주석
 */
/***
 * KDoc 여러줄 주석
 * 메소드에 포함된 파라미터 등을 설명하기위해 사용된.
 * 자바랑 다르다는 생각은 들지 않는다.
 * 코틀린은 여러줄 주석을 여러번 내포시킬수 있다고 하넹
 */

fun main() {
//    !!는 not-null assertion
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()

//    코틀린에선 타입 추론 사용 가능
    val a = readLine()!!
    val b = readLine()!!

//    타입 명시도 가능하다
    val n: Int = 100
    val text: String = "Hello!"

    //val은 불변(java - final) var은 가변

    println(a+b)
}
