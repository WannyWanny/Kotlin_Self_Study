package chapter4

/**
 * Nested Class
 * 자바와 달리, 바깥족 클래스는 자신에게 내포된 클래스의 비공개 멤버에 접근할 수 없다.
 */
class Person4 (var id: Id, val age: Int){
    class Id(val firstName: String, val familyName: String)
    fun showMe() = println("${id.firstName} ${id.familyName}, $age")
}

fun main() {
    val id = Person4.Id("Lee", "WanHEe")
    val person = Person4(id, 24)
    person.showMe()
}