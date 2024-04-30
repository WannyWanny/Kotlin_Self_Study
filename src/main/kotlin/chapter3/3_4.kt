package chapter3

import kotlin.random.Random

//fun main() {
//    val num = Random.nextInt(1, 101)
//    var guess = 0
//
//    while (guess != num) {
//        guess = readln().toInt()
//        if (guess < num) println("Too Small")
//        else if (guess > num) println("Too Big")
//    }
//
//    println("Right: it's $num")
//}

fun main() {
    val a = IntArray(5) {it*it}
    var sum = 0;

    for (x in a) {
        sum += x
    }

    println("Sum: $sum")
}

fun parseIntNumber(s: String, fallback: Int = -1): Int {
    var num = 0

    if (s.length !in 1..31) return fallback

    for (c in s) {
        if (c !in '0'..'1') return fallback
        num = num*2 + (c - '0')
    }
    return num
}

fun countLetters(text: String): IntArray {
    val counts = IntArray('z' - 'a' + 1)

    for (char in text) {
        val charLower = char.lowercaseChar()
        if (charLower !in 'a'..'z') continue
        counts[charLower - 'a']++
    }

    return counts
}