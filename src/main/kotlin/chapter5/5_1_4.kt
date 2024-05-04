package chapter5

fun check2(s: String, condition: (Char) -> Boolean): Boolean {
    for (c in s) {
        if (!condition(c)) return false
    }
    return true
}

fun isCapitalLetter(c: Char) = c.isUpperCase() && c.isLetter()

fun main() {
//    println(check2("Hello") {c -> isCapitalLetter(c) })
    println(check2("Hello") {isCapitalLetter(it) })
    println(check2("Hello",  ::isCapitalLetter))
}