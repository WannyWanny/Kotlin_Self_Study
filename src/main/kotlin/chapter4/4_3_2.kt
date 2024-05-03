package chapter4

import java.io.File

/**
 * 아래 예제의 단점은 실제 값이 항상 사용 전에 초기화되므로 절대 널이 될 수 없는 값이라는
 * 사실을 알고 있음에도 불구하고 늘 널 가능성을 처리해야 한다는 점이다.
 * lateinit 키워드를 적용해보자
 */
//class Content {
//    var text: String? = null
//
//    fun loadFile(file: File) {
//        text = file.readText()
//    }
//}
//
//fun getContentSize(context: Content) = context.text?.length ?: 0

class Content {
    lateinit var text: String

    fun loadFile(file: File) {
        text = file.readText()
    }
}

fun getContentSize(context: Content) = context.text.length
