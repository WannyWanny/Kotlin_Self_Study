package chapter4

/**
 * 코틀린은 모든 참조 타입은 널이 될 수 없다.
 */
fun isLetterString(s: String): Boolean {
    if (s.isEmpty()) return false
    for (ch in s) {
        if (!ch.isLetter()) return false
    }
    return true
}

fun main() {
   println(isLetterString("abc"))
//   println(isLetterString(null))
//   error: null can not be a value of a non-null type String

    println(isBooleanString(null)) // ok
    val s: String? = "abc"
//    val ss: String = s
//    error: type mismatch: inferred type is String? but String was expected
}

//널이 될수도 있는 값을 받는 함수를 작성하려면 타입 뒤에 물음표를 붙인다.
fun isBooleanString(s: String?) = s == "false" || s == "true"

