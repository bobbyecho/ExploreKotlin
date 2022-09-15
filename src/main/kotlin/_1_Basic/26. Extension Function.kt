fun String.hello(): String = "hello $this"
fun String.printHello(): Unit = println("hello $this")

fun main() {
    val name = "bobby"

    println(name.hello())

    name.printHello()
}