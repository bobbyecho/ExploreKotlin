fun helloSingleExpression(name: String): Unit = println("Hello $name")

fun intSingleExpression(a: Int): Int = a * 2

fun main() {
    helloSingleExpression("Bobby")
    println(intSingleExpression(5))
}