package chapter7

fun main() {
    val emptyList = emptyList<String>()
    println(emptyList)
//    emptyList.add("abc") // error: add is unresolved

    val singletonSet = setOf("abc")
    println(singletonSet)   //[abc]
//    singletonSet.remove() // error: remove is unresolved

    val mutableList = mutableListOf("abc")
    println(mutableList)
    mutableList.add("def")
    mutableList[0] = "xyz"
    println(mutableList)
}