
fun helloString(name: String): String {
    return "Hello $name"
}

fun sum(a: Int, b: Int): Double {
    return (a + b).toDouble()
}

fun main() {
    println(helloString("Bobby"))
    println(sum(1, 5))
}