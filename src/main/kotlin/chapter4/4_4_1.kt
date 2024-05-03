package chapter4

/**
 * 자바와 마찬가지로 코틀린도 어떤 클래스에 인스턴스가 하나만 존재하게 보장하는 싱글턴 패턴을 내장한다.
 * class 대신 object 키워드를 사용한다.
 */
object Application {
    val name = "My Application"

    override fun toString() = name

    fun exit() {}
}