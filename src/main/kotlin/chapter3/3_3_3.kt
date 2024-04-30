package chapter3

//fun hexDigit(n: Int): Char {
//    if (n in 0..9)  return '0' + n
//    else if (n in 10..15) return 'A' + n - 10
//    else return '?'
//}

fun hexDigit(n: Int): Char {
    return when (n) {
        in 0..9 -> '0' + n
        in 10..15 -> 'A' + n - 10
        else -> '?'
    }
}