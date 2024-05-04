package chapter5

fun measureTime(action: () -> Unit): Long {
    val start = System.nanoTime()
    action()
    return System.nanoTime() - start
}

fun check(s: String, condition: (Char) -> Boolean): Boolean {
    for (c in s) {
        if (!condition(c)) return false
    }
    return true
}

fun main() {
    println(measureTime { 1 + 5 })
    println(check("Hello") {c -> c.isLetter()}) //true
    println(check("Hello") {c -> c.isLowerCase()}) //false
}