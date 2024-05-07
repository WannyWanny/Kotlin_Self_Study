package chapter8

class Organization (
    name: String,
    address: Address,
    val manager: Person
) : Entity(name, address)

fun main() {
    val address = arrayOf(
        Address("Seoul", "Wanny", "92"),
        Address("Tyoko", "Senggu", "42"),
        Address("Busan", "Beach", "12")
    )

    println(address.indexOf(Address("chang", "gug", "54")))
}