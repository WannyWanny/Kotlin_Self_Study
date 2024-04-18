package chapter2

/**
 * 정수를 표현하는 4가지 타입 존재
 * Byte, Short, Int, Long
 */

fun main() {
    //숫자에 _를 넣어서 가독성을 높일수도 있다는거 처음 알았음
    val num = 12_345_000

    val hundredLong = 100L      //Long 타입으로 추론됨
//    val hundredInt: Int = 100L     //Error: assigning Long to Int

    /**
     *  코틀린에선 &와 | 연산자를 제공하지 않는다. and 와 or로 사용하자
        ex) println((x == 1) and (y != 0))

        두 인자가 모두 같은 타입일 때만 ==와 !=를 허용
     */
}
