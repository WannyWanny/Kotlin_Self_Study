package chapter4

//널 복합 연산자인 ?:(엘비스 연산자)가 있다. 이 연산자를 사용하면 널을 대신할 디폴트 값을 대신 지정할 수 있다.
fun sayHello(name: String?) {
    println("Hello, " + (name ?: "Unknown"))
}

fun main() {
    sayHello("John")
    sayHello(null)
}
