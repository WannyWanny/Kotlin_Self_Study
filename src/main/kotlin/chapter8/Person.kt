package chapter8

class Person(
    name: String,
    address: Address,
    val age: Int
): Entity(name, address)