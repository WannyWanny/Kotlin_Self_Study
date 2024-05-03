package chapter4

/**
 * 자바는 필드를 다루고, 코틀린은 프로퍼티(필드 + 접근자)를 다룬다.
 */
//class Person {
//    var firstName: String = ""
//    var familyName: String = ""
//    var age: Int = 0
//
//    fun fullName() = "$firstName $familyName"
//
//    fun showMe() {
//        print("${fullName()}: $age")
//    }
//}

class Person(private val firstName: String, private val familyName: String) {
    fun fullName() = "$firstName $familyName"
}

fun main() {
    val person = Person("Lee", "Wanhee")

//    println(person.firstName)
    // error: cannot access 'firstName': it is private in 'Person'
    println(person.fullName())
}