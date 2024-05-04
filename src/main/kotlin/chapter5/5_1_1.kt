package chapter5

/**
 * 람다를 사용해 계산을 수행하는 예시
 */
//fun sum(numbers: IntArray): Int {
//    var result = numbers.firstOrNull() ?: throw IllegalArgumentException("Empty Array")
//
//    for (i in 1..numbers.lastIndex) {
//        result += numbers[i]
//    }
//    return result
//}

fun aggregate(numbers: IntArray, op: (Int, Int) -> Int): Int {
    var result = numbers.firstOrNull() ?: throw IllegalArgumentException("Empty Array")

    for (i in 1..numbers.lastIndex) result = op(result, numbers[i])

    return result
}

fun sum(numbers: IntArray) =
    aggregate(numbers)
    { result, op -> result + op }

fun max(numbers: IntArray) =
    aggregate(numbers)
    { result, op -> if (op > result) op else result }


fun main() {
    print(sum(intArrayOf(1, 4, 5)))
    print(max(intArrayOf(1, 5, 2)))
}