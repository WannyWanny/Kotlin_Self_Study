package chapter10

annotation class Dependency(val arg:String, val componentNames: String="Core")
annotation class Component(val name: String = "Core")

@Component("I/O")
class IO