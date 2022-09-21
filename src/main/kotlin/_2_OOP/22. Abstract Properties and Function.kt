abstract class Animal {
    abstract val name: String
    abstract fun run(): String
}

class Dog: Animal() {
    override val name: String = "Helli"

    override fun run(): String {
        return "dog can run"
    }

}

fun main() {
    val dog = Dog()
    println(dog.name)
    println(dog.run())
}