/**
 * Example comment
 * @param name your name
 * @param age how old are you?
 * @return Unit
 */
fun helloDoc(name: String, age: Int): Unit {
    println("Hello $name, you are $age years old")
}

fun main() {
    helloDoc("Bobby", 27)
}