package chapter4

import java.io.File

/**
 * 프로퍼티를 처음 읽을 때까지 그 값에 대한 계산을 미뤄두고 싶을때 lazy 프로퍼티를 통해 이를 달성한다.
 * lazy 프로퍼티는 thread-safe하다.
 */
val text by lazy {
    File("data.text").readText()
}

fun main() {
    while (true) {
        when (val command = readlnOrNull() ?: return) {
            "print data" -> println(text)
            "exit" -> return
        }
    }
}