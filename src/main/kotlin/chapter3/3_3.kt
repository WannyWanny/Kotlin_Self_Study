package chapter3

fun max(a: Int, b: Int): Int {
    return if (a>b) a
    else b
}

fun max2(a: Int, b: Int) = if (a>b) a else b

//fun main() {
//    val s = readLine()!!
//    val i = s.indexOf("/")
//
//    // 10/3 문자열을 /를 기준으로 10과 3으로 나눠서 수행한다
//    val result = if (i>=0) {
//        val a = s.substring(0, i).toInt()
//        val b = s.substring(i+1).toInt()
//        (a/b).toString()
//    } else ""
//
//    print(result)
//}

//코틀린은 자바에서 사용되는 삼항연산자를 사용할 수 없다.
//Nothing 타입은 모든 코틀린 타입의 하위 타입으로 간주
fun renamePackage(fullName: String, newName: String): String {
    val i = fullName.lastIndexOf('.')
    val prefix = if (i>=0) fullName.substring(0, i+1) else return newName
    return prefix + newName
}

fun main() {
    val num = readln().toInt()
    println(num in 10..99)
    println(num !in 10..99)

    println("def" in "abc".."xyz") //true
    println("zzz" in "abc".."xyz") //false

    println(5 in 5..5) // true
    println(5 in 5 until 5) // false
    println(5 in 10..1) // false

    println(5 in 10 downTo 1) // true
    println(5 in 1 downTo 10) // false
}