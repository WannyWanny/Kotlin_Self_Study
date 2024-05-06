package chapter7

fun main() {
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")

    for ((key, value) in map) {
        println("$key -> $value")
    }

    intArrayOf(1, 2, 3).forEach { println(it*it) }
    listOf("a", "b", "c").forEach { println("$it") }
    sequenceOf("a", "b", "c").forEach { println("$it") }

    val readOnly = listOf(1, 2, 3)
//    readOnly += 4
    var mutable = listOf(4, 5, 6)
    mutable += 7
}