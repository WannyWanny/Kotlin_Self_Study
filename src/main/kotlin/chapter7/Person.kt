package chapter7

class Person(
    val firstName: String,
    val familyName: String,
    val age: Int
) : Comparable<Person> {
    val fullName get() = "$firstName $familyName"
    override fun compareTo(other: Person) = fullName.compareTo(other.fullName)
}
