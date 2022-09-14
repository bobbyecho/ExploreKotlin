fun factorialLoop(value: Int): Int {
    var result = 1;
    for (i in value downTo 1) {
        result *= i
    }
    return result
}


fun recursiveFactorialLoop(value: Int): Int {
    return when (value) {
        1 -> 1
        else -> value * recursiveFactorialLoop(value - 1)
    }
}

fun main() {
    println(factorialLoop(10))
    println(recursiveFactorialLoop(10))
}