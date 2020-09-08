// Example of Open Closed Principle using Animals
fun main() {
    val dog = Dog("Spot")
    dog.speak()
    dog.woof()
}

open class Animal(private val name: String) {
    fun speak() {
        println("My name is $name")
    }
}

// Dog class is able to add the woof() functionality
// but the Dog class is unable to change the existing speak() functionality
class Dog(dogsName: String): Animal(dogsName) {
    fun woof() {
        println("woof!")
    }
}