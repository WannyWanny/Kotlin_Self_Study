package chapter9

typealias IntPredicate = (Int) -> Boolean
typealias IntMap = HashMap<Int, Int>

fun readFirst(filter: IntPredicate) = generateSequence { readlnOrNull()?.toIntOrNull() }.firstOrNull(filter)

fun main() {
    val map = IntMap().also {
        it[1] = 2
        it[2] = 3
    }

    var filter: IntPredicate = {it%2==0}
    println(readFirst(filter))
}

