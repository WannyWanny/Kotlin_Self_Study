package chapter4

/**
 * Factory 메소드를 동반 객체로 정의함으로써 매번 내포된 객체의 이름을 지정해야 하는 문제를 해결할 수 있다.
 * 동반 객체는 companion키워드를 덧붙인다.
 */
class Application2 private constructor(val name: String) {
    companion object Factory {
        fun create(args: Array<String>): Application2? {
            val name = args.firstOrNull() ?: return null
            return Application2(name)
        }
    }
}

fun main(args: Array<String>) {
    val app = Application2.create(args) ?: return
    println("Application started: ${app.name}")
}