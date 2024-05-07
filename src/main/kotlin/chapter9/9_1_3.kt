package chapter9

fun main() {
    val list = listOf(1, 2, 3)
    list is List<Number>    //ok
//    list is List<String>  error: cannot check for instance of erased type: List<String>
    list is List<*>
}