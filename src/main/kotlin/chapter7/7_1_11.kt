package chapter7

fun main() {
//    ed는 불변객체에 붙인다.
//    println(intArrayOf(5, 6, 1, 2, 4).sort())
//    println(intArrayOf(5, 6, 1, 2, 4).sorted())

    var array1 = intArrayOf(5, 6, 1, 2, 4)
    val array2 = intArrayOf(5, 6, 1, 2, 4)

    println(array1.sort())
    println(array1.sorted())

    println(array2.sort())
    println(array2.sorted())

    val array3 = intArrayOf(4, 0, 8, 9, 2).apply { sort() }
    println(array3.contentToString())
}